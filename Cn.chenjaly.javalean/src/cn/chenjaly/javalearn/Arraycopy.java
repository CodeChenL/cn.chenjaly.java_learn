package cn.chenjaly.javalearn;

import java.util.Arrays;
public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1 [] = {0,1,2,3,4,5,6,7,8,9};
		int array2 [] = {0,0,0,0,0,0,0,0,0,0};
		System.out.println("array2数据初始的值");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println("\n复制array1数组的元素给array2");
		System.arraycopy(array1, 0, array2, 0, 10);
		System.out.print("array2:");
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2 [i] +" ");
		}
		System.out.println();
		System.out.print("array2排序后:");
		Arrays.sort(array2);
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2 [i] +" ");
		}
		System.out.println();
		System.out.println("列出array1中的4\n"+Arrays.binarySearch(array1, 4));
	}
}
