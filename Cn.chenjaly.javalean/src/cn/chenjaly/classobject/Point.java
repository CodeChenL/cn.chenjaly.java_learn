package cn.chenjaly.classobject;

public class Point {

	public int x = 1;
	public int y = 1;
	public int z = 1;
	
	public Point() {
		
	}
	
	public Point(int x,int y,int z) {
	
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1 = new Point();
		System.out.println(point1.x+" "+point1.y+" "+point1.z);
		
		Point point2 = new Point(2, 2, 2);
		System.out.println(point2.x+" "+point2.y+" "+point2.z);
	}

}
