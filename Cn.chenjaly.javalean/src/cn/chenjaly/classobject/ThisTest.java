package cn.chenjaly.classobject;

public class ThisTest {

	int a,b,c;
	ThisTest(){
		System.out.println("正要new一个对象");
	}
	
	ThisTest(int a,int b){
		this();
		this.a = a;
		this.b = b;
	}
	
	public void sing() {
		System.out.println("唱歌");
	}
	
	public void eat() {
		this.sing();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisTest ttTest = new ThisTest();
		System.out.println(ttTest.a);
		ThisTest ttTest2 = new ThisTest(2,3);
		System.out.println(ttTest2.a);
		ttTest2.eat();
	}

}
