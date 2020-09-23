package cn.chenjaly.classobject;


public class Student0 {
	
	private int id;
	private String name;
	private int age;
	private char sex;

//	上课
	public void study() {

		System.out.println("学生在上课");
		
	}
	
//	上课
	public void text() {

		System.out.println("学生在考试");
		
	}
	
//	学生的操行
	public int CaoXing() {

		return 100;
		
	}
	
	public Student0(int id,String name,char sex) {
		
		this.id = id;
		this.name = name;
		this.sex = sex;
		
	}
	public Student0() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student0 zhangsan = new Student0();
		zhangsan.study();
		
		Student0 lisi = new Student0(201, "李四", '男');
	}

}
