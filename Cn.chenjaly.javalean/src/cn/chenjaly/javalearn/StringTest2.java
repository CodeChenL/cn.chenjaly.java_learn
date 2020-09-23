package cn.chenjaly.javalearn;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s5 = "java语言";
		String s7 = "java是世界上最好的语言(误)";
		String s6 = "语言";
		int index = s5.indexOf(97);
		System.out.println("a字符第一次出现的位置是:"+index);
		
		int index1 = s5.indexOf('a');
		System.out.println("a字符第一次出现的位置是"+index1);
		
		int pos1 = s6.lastIndexOf(s7);
		System.out.println("s7在s6中最后一次出现的位置"+pos1);
		
		System.out.println("s5和s7是否相等"+s5.equals(s7));
		String s8 = "java";
		String s9 = "JAVA";
		System.out.println("s8和s9是否相等"+s8.equalsIgnoreCase(s9));
		
		String s10 = "python";
		String s11 = "python";
		System.out.println("s8和s10是否相等"+ s8.compareTo(s10));
		System.out.println("s10和s8是否相等"+ s10.compareTo(s8));
		System.out.println("s10和s11是否相等"+ s10.compareTo(s11));
		
		String s12 = s11.replace(s11, s9);
		System.out.println(s12);
	}

}
