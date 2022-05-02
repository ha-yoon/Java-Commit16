package exception;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1 / 0);
		}catch(ArithmeticException ae) {
			
			ae.printStackTrace();
						
			System.out.println("메세지: " + ae.getMessage());
		}
		
		try {
		Exception e = new Exception("예외가 발생!!!");

		throw e;
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("메세지: " + e.getMessage());
	}

}
}
