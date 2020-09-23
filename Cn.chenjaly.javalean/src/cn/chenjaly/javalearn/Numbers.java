package cn.chenjaly.javalearn;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {

//		int [] arr = {1,2,3,4};
//		arr = null;
//		System.out.println("arr [0] = " + arr [0]);
//		System.out.println("arr [1] = " + arr [1]);
//		System.out.println("arr [2] = " + arr [2]);
//		System.out.println("arr [3] = " + arr [3]);
//		System.out.println("arr [3] = " + arr [4]);
//		System.out.println(arr[0]);
//
//
//		int [] arrs = new int [4];
//		arrs [0] =1;
//		arrs [1] = 2;
//		System.out.println("arrs [0] = " + arrs [0]);
//		System.out.println("arrs [1] = " + arrs [1]);
//		System.out.println("arrs [2] = " + arrs [2]);
//		System.out.println("arrs [3] = " + arrs [3]);
//		int [] arrss = new int [4];
//		System.out.println("arrss="+arrss [3]);
//		arrss=null;
//		System.out.println(arrss[0]);
//		Scanner input=new Scanner(System.in);
		int [] arr = new int [5];int x;
		for(x=0;x < arr.length;x++)
		{
			Scanner sc =new Scanner(System.in);
			  arr[x]= sc.nextInt();
			  
		}
		for (x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}

}
