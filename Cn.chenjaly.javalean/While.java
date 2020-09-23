package cn.chenjaly.hello;

public class While {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

//		int x=1;
//		do {
//			System.out.println("x="+x);
//			x++;
//		} while (x<=4);
//		int m=3,n=6,k=0;
//		while (m++<--n) {
//			
//			++k;
//		}
//		System.out.println(k);
		int result=1,i=1;
		do {
			result*=i;
			i++;
		} while (i<=10);
		System.out.println("10好的!="+result);
	}

}
