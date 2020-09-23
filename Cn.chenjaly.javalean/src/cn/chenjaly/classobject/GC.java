package cn.chenjaly.classobject;

public class GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GC s = new GC();
		
//		s = null;
		
		try {
			s.finalize();
		}
		catch (Throwable e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		System.gc();
	}

}
