package cn.chenjaly.javalearn;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum,y;
//		
//		for ( sum = 1,y=1; y <= 100; y++) {
//			
//			sum+=y;
//		
//		}
//
//			System.out.println(sum);

//		int i,j,k;
//		for(i=1;i<=10;i++)
//		{
//			for(j=1;j<=10-i;j++)
//			{
//				System.out.print(" ");
//				
//			}
//			for(k=1;k<=2*i-1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int x = 1;int z=0;
//		for ( x = 0; x <= 20; x++) {
//
//			if (x%2 != 0) {
//				continue
//				if (z<=5) {
//					System.out.println(x);
//				}
//			}
//		}
		int x = 0;int y=0;
		for ( x = 0; x <= 100; x++) {
			if (x%2!=0) {
				
				continue;
			}
			y=y+x;
		}
		System.out.println(y);
	}

}
