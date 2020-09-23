package 多态;

public class Rectangle extends Shape{

	private double len;
	private double wid;
	Rectangle (double len,double wid){
		this.len = len;
		this.wid = wid;
		
	}
	public double getArea() {
		return len*wid;
	}
	public double getPan() {
		return 2*len+2*wid;
	}
}
