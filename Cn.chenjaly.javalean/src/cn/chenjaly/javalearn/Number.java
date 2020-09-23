package cn.chenjaly.javalearn;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,1,0};
//		ArrayCompare(int[]arr);
//		for (int i = 0; i < arr.length-1; i++) {
//			if (arr[i]>arr[i+1]) {
//				
//				temp=arr[i+1];
//				arr[i+1]=arr[i];
//				arr[i]=temp;
//				
//				
//			}
//		}
//		System.out.println(arr[arr.length-1]);
		System.out.println(ArrayCompare (arr));
			
	}
	public static int ArrayCompare (int[ ] arr) {
		
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				
				
			}
		}
		return arr[arr.length-1];
		
	}

}
