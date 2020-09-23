package cn.chenjaly.classobject;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1(001, "张三");
		
		s.study(); //public 成员向所有人开放
		
//		System.out.println(s.name); //private成员不能被其他类直接访问
		System.out.println(s.getName()); //publi成员向所有人开
		System.out.println(s.age); //defaul成员可以被同包的其他类访问
	}

}
