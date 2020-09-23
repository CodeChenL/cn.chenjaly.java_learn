package cn.chenjaly.classobject;

public class Person {

//	privat私有的,同一个类的所有方法能访问
	private int age = 21;
//	default默认的访问属性
	double salary = 1200.3;
	
	private void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
//		private修饰的成员变量,在同一个类中可见
		System.out.println(person.age);
//		不写修饰符的成员变量,在同一个类中可见
		System.out.println(person.salary);
	}

}
