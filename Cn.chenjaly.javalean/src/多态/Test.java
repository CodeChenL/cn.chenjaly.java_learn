package 多态;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square square = new Square(4);
		System.out.println("正方形的面积:"+square.getArea());
		System.out.println("正方形的周长:"+square.getPan());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("长方形的面积:"+rectangle.getArea());
		System.out.println("长方形的周长:"+rectangle.getPan());
	}

}
