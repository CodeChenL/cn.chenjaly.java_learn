package 多态;

public class Cat extends Animal{

	int num = 80;
	static int age = 90;
	
	String name = "tomcat";
	
//	重写父类的方法
	public void eat() {
		System.out.println("猫吃饭");
	}
	
//	重写父类的静态方法
	public static void sleep() {
		System.out.println("猫在睡觉");
	}
	
	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
