package cn.chenjaly.classobject;

public class Undergraduate extends Student2{

	String degree;
	
	public Undergraduate() {
		
	}
	public Undergraduate (int id,String name,String degree) {
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	
	public void show() {
		System.out.println("我的名字是"+name+",我的学位是"+degree);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Undergraduate testUndergraduate = new Undergraduate(15, "张三","学士");
		testUndergraduate.study();
		System.out.println(testUndergraduate.name+"的学号是"+testUndergraduate.id);
	}

}
