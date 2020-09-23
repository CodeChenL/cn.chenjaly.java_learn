package cn.chenjaly.classobject;

public class Teacher {

	private String Tid;
	private String name;
	private String age;
	private String major;
	
//	上课
	public void Lectrue() {

		System.out.println("教师在上课");
		
	}
	
//	备课
	public void BeiKe() {

		System.out.println("教师在备课");
		
	}
	
//	开会
	public void KaiHui() {

		System.out.println("教师在开会");
		
	}
	
//	根据班级名称求改卷数量
	public int MarkPaper() {

		return 50;
		
	}
	
//	老师所教人数
	
	public int StudentNumbei() {

		return 55;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher zhangsan = new Teacher();
		Teacher lisi = new Teacher();
		Teacher wangwu = new Teacher();
		
	}

}
