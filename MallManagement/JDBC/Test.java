package cn.yueqian;

import java.util.List;

public class Test {
public static void main(String[] args) {
	EmpDao dao  = new EmpDao();
	List<Emp> list = dao.findAll();
	for (Emp emp : list) {
		System.out.println(emp);
	}
}
}
