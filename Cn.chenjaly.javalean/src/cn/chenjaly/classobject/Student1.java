package cn.chenjaly.classobject;

public class Student1 {

//	类的成员变量
	private int id;
	private String name;
	int age; //默认default
	
//	公开的get/set方法
	public String getName() {
		return name ;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student1 (int id,String name) {
		this.name = name;
		this.id = id;
	}
	
//	类的成员方法
	public void study() {
		System.out.println("正在学习");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1(001, "张三");
		System.out.println(s.name); // private 成员可以被本类对象访问
	}

}
