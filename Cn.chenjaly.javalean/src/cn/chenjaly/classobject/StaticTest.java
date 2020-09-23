package cn.chenjaly.classobject;

class Test{
	static String staticStr = "静态的变量";
	String str = "非静态的变量";
	
	public static void test1() {
		System.out.println("静态方法");
	}
	
	public void test2() {
		System.out.println("非静态方法");
	}
}

public class StaticTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test.test1();
		System.out.println(Test.staticStr);
		Test test = new Test();
		Test test1 = new Test();
		
		test.test2();
		System.out.println(test.str);
		
		System.out.println(test.staticStr);
		System.out.println(test1.staticStr="改变");
		System.out.println(test.staticStr);
	}

}
