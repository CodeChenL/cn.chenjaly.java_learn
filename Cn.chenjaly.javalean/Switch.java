package cn.chenjaly.hello;

public class Switch {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		int y=2020;
		if (y%4==0) {
			
			if (y%100==0) {
				if(y%400==0) {
					System.out.println(y+"������");
				}
				else {
					System.out.println(y+"��������");
				}
			}
			else {
			System.out.println(y+"������");
		    } 
		
	    }
		else {

			System.out.println(y+"��������");
		}
	}

}
