package cn.chenjaly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import com.mysql.jdbc.EscapeTokenizer;

import cn.chenjaly.pojo.Good;
import cn.chenjaly.utils.DBUtil;

public class ShowView {

//	获取键盘输入对象
	Scanner input = new Scanner(System.in);
	
//	系统运行的方法
	public void ShopStart() {
		System.out.println("==============================欢迎来到超市管理系统>_<==============================");
		String isGo = "y";
		do {
			showMenu();
//			输入的字符串
			String select = input.next();
			switch (select) {
			case "1":
//				System.out.println("商品入库");
				insertGood();
				break;
			case "2":
				System.out.println("输入 商品编号查询商品");
				int goodId = 0;
				Good good = new Good();
				while (true) {
					goodId = input.nextInt();
					good = searchGoodById(goodId);
					if (good!=null) {
						break;
					}
					System.out.println("此商品不存在,请重新输入商品编号");
				}
				System.out.println("商品编号:"+goodId+"  商品名称:"+good.getName()+"  商品库存"+good.getPrice()+"  商品库存:"+good.getNum());
				
				
				
				break;
			case "3":
//				System.out.println("商品列表");
				getGoodList();
				break;
			case "4":
//				System.out.println("购买商品");
				buyGoods();
				break;
			case "5":
				System.out.println("删除商品");
				break;
			case "6":
				System.out.println("更新商品");
				break;
			case "0":
				System.out.println("正在退出系统");
				System.exit(0);
			default:
				System.out.println("输入有误请从新输入！！！！！！！！！！！！");
				continue;
			}
			System.out.println("输入y继续，否则退出");
			isGo =  input.next();
		} while (isGo.equals("y"));
		System.out.println("==============================欢迎下次使用，再见>_<==============================");
	}
	
	private void showMenu() {
		System.out.println("1. 商品入库");
		System.out.println("2.根据商品编号查询商品");
		System.out.println("3.商品列表");
		System.out.println("4.购买商品");
		System.out.println("5.删除商品");
		System.out.println("6.更新商品");
		System.out.println("0.退出系统");
	}
	
	private void insertGood() {
//		商品编号
		int id = 0;
		System.out.println("输入商品编号");
		while (true) {
			id = input.nextInt();
//			判断编号是否重复
			if (searchGoodById(id)==null) {
				break;
			}
			System.out.println("编号重复，请从新输入商品编号");
		}
		System.out.println("输入商品名称");
		String name = input.next();
		System.out.println("输入商品定价");
		float price = input.nextFloat();
		System.out.println("库存");
		int num = input.nextInt();
		String sql = "insert into t_good (id,name,price,num) VALUES (?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, price);
			ps.setInt(4, num);
			int flag = ps.executeUpdate();
			if (flag>0) {
				System.out.println("操作成功");
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				DBUtil.closeConnection(con, ps, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private Good searchGoodById(int id) {
//		执行sql语句
		String sql = "select * from t_good where id =?" ;
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			connection = DBUtil.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Good good = new Good();
				good.setId(rs.getInt("id"));
				good.setName(rs.getString("name"));
				good.setPrice(rs.getFloat("price"));
				good.setNum(rs.getInt("num"));
				return good;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DBUtil.closeConnection(connection, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
//	查询商品列表
	private void getGoodList() {
		String sql = "select * from t_good";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("编号\t"+"名称\t"+"价格\t"+"库存\t");
			if (rs.wasNull()) {
				System.out.println("没有商品");
			}
			else {
				while (rs.next()) {
					System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getFloat("price")+"\t"+rs.getInt("num")+"\t");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DBUtil.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	购买商品
	private void buyGoods() {
//		用来储存购买商品价格
		ArrayList<Good> goods = new ArrayList<>();
//		是否继续购买
		String flag = "y";
		do {
			System.out.println("输入购买商品的编号");
			int id = input.nextInt();
			Good good = searchGoodById(id);
			if (good!=null) {
				System.out.println("输入要购买商品的数量");
				int num = input.nextInt();
				if (good.getNum()<num) {
					System.out.println("此商品库存数量不足"+"库存为"+good.getNum());
				}
				else {
					String sql = "update t_good set num=? where id = ?";
					Connection con = null;
					PreparedStatement ps = null;
					ResultSet rs = null;
					try {
						con = DBUtil.getConnection();
						ps = con.prepareStatement(sql);
						ps.setInt(1, good.getNum()-num);
						ps.setInt(2, id);
						int flag1 = ps.executeUpdate();
						if (flag1>0) {
							Good good2 = new Good(id, good.getName(), good.getPrice(), num);
							if (goods.size()>0) {
								for (int i = 0; i < goods.size(); i++) {
									if (goods.get(i).getId()==id) {
										goods.get(i).setNum(num+goods.get(i).getNum());
									}
									else {
										goods.add(good2);
									}
								}
							}
							else {
								goods.add(good2);
							}
							System.out.println("购买成功");
						}
						else {
							System.out.println("购买失败");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("购买异常"+e.getMessage());
					}finally {
						try {
							DBUtil.closeConnection(con, ps, null);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			System.out.println("输入y继续购买,否则结算");
			flag = input.next();
			if (!flag.equals("y")) {
				account(goods);
			}
			}
			else {
				System.out.println("没有商品");
			}

//			结算
			
			
			
		} while (flag.equals("y"));
	}
	private void account(ArrayList<Good> goods) {
		System.out.println("编号\t"+"名称\t"+"数量\t"+"总价");
		for (int i = 0; i < goods.size(); i++) {
			System.out.println(goods.get(i).getId()+"\t"+goods.get(i).getName()+"\t"+goods.get(i).getNum()+"\t"+goods.get(i).getNum()*goods.get(i).getPrice());
		}
		int sum = 0;
		for (int i = 0; i < goods.size(); i++) {
			sum+=goods.get(i).getNum()*goods.get(i).getPrice();
		}
		System.out.println("合计消费"+sum+"元");
	}
	private void deleteGood(int id) {
		String sql = "delete from t_good where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		
	}
}
