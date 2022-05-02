package exception;

public class Ex02 {

	public static void main(String[] args) {

		try {
			System.out.println(1 / 0);
		
			System.out.println(args[0]);
		
		
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException 예외 발생");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException 예외발생");
		}catch(Exception e) {
			System.out.println("Exception 예외발생");
		}
		


	}

}
