package 多态;

public class Postgraduate extends Student{

	String degree;
//	方法重写,实现抽象方法
	public void study() {
		System.out.println("研究生在读");
	}
}
