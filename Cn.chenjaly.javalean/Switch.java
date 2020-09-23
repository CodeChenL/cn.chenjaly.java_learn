package cn.chenjaly.hello;

public class Switch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int y=2020;
		if (y%4==0) {
			
			if (y%100==0) {
				if(y%400==0) {
					System.out.println(y+"是闰年");
				}
				else {
					System.out.println(y+"不是闰年");
				}
			}
			else {
			System.out.println(y+"是闰年");
		    } 
		
	    }
		else {

			System.out.println(y+"不是闰年");
		}
	}

}
