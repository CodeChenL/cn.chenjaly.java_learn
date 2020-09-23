package 多态;

public abstract class Student {

	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public Student() {
		
	}
//	抽象方法子类,必须实现
	public abstract void study();

}
