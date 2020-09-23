package 多态;

public class Square extends Shape{

	protected double len;
	Square(double len){
		this.len = len;
	}
	public double getArea() {
		return len*len;
	}
	public double getPan() {
		return 4*len;
	}
	public double pan() {
		return len;
		
	}
}
