package 多态;

public class Undergraduate extends Student{

	String degree;
//	方法重写,实现抽象方法
	public void study() {
		System.out.println("本科生在读");
	}
	public static void main(String [] args) {
		Student []students = new Student[] {
				new Undergraduate(),
				new Undergraduate(),
				new Postgraduate()
		};
		for (int i = 0; i < students.length; i++) {
			students[i].study();
		}
	}
}
