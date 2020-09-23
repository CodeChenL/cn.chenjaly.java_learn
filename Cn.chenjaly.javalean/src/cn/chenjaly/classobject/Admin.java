package cn.chenjaly.classobject;

public class Admin {

//	private在同一个类中其他方法都可以访问
	int a = 0;
	
	private double area() {
		return 3.14*a*a;
	}
	
	public void setA (int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admin aptestAdmin = new Admin();
		
	}

}
