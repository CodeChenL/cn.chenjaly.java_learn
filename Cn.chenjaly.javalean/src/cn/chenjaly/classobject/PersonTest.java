package cn.chenjaly.classobject;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
//		在同一个包中,默认访问权限的成员变量或方法在其它类中是可见的
		System.out.println(p1.salary);
//		System.out.println(p1.updateSalary);
	}

}
