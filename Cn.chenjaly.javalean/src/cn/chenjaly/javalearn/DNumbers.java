package cn.chenjaly.javalearn;
import java.util.Scanner;
public class DNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] [] arrs = new int [3] [4];
//		System.out.println(arrs.length);
//		System.out.println(arrs[0].length);
//		for (int i = 0; i < 3; i++) {
//			
//			for (int x = 0; x < 4; x++) {
//				Scanner sc =new Scanner(System.in);
//				  arrs[i] [x]= sc.nextInt();
//			}
//			
//		}
//		for (int i = 0; i < 3; i++) {
//			
//			for (int x = 0; x < 4; x++) {
//				System.out.print(arrs[i][x]+" ");
//			}
//			System.out.println();
//		}
		int[][]  a = {{1,2,3,4},{5,6,7,8},{5,0,9,8}};

		System.out.println(printArray (a));

	}
		public static int printArray (int[][] arrs) {
			int sum = 0;
		
			for (int i = 0; i < arrs.length; i++) {
				
				for (int x = 0; x < arrs[0].length; x++) {
					
					sum+=arrs[i][x];
				}
			
			}
			return sum;

		}

}
