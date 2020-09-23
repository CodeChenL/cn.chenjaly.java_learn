package cn.yueqian.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//把几个用于连接数据库的字符串定义成常量，不必每次去创建,这些字符串也可以通过配置文件方式读取
	private static final String USER = "root";//数据库用户名
	private static final String UPWD = "123456";//数据库密码
	//本地数据库shop
	private static final String URL = "jdbc:mysql://localhost:3307/mall_management?useUnicode=true&characterEncoding=utf-8";
	//驱动
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	//注册驱动
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//得到数据库连接对象Connection的函数
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(URL, USER, UPWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	//关闭所有的打开资源
	public static void closeConnection(Connection connection, Statement statement, ResultSet rs) throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(statement!=null){
			statement.close();
		}
		if(connection!=null){
			connection.close();
		}
	}

}
