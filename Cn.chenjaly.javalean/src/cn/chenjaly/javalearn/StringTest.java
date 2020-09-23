package cn.chenjaly.javalearn;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String();
		
		String s2 = new String("Hello");
		
		char[] chars = {'a','b','c'};
		String s3 = new String(chars);
		
		String s4 = "中文";
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
		
//		String类的常用方法
		System.out.println("s4的长度="+s4.length());
		
		char pos = s2.charAt(1);
		System.out.println("s2第二个位置上的字符是"+pos);
		
		String result = s2.substring(2, 5);
		System.out.println("s2第二个位置到第四个位置的子串是"+result);
		
		String result2 = s2.substring(1);
		System.out.println("s2第二个位置到结尾的子串是"+result2);
		
//		String类的常用方法-查找方法
		String s5 = "java";
		String s6 = "java是java";
		String s7 = "JAVA";
		String s8 = "python";
		int pos1 = s5.indexOf(97);
		System.out.println("s5中字符码为97的字符位置"+pos1);
		
		int pos2 = s5.indexOf('a');
		System.out.println("s5中字符a的位置"+pos2);
		
		int pos3 = s6.lastIndexOf(s5);
		System.out.println("s6中s5子串最后出现的位置"+pos3);
		
//		string类的比较
		System.out.println("s5和s6是否相等"+s5.equals(s6));
		System.out.println("s5和s7是否相等"+s5.equals(s7));
		System.out.println("s5和s7是否相等忽略大小写"+s5.equalsIgnoreCase(s7));
		System.out.println("s5和s8是否相等"+s5.compareTo(s8));
		
	}

}
