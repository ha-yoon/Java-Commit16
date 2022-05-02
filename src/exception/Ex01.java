package exception;

public class Ex01 {

	public static void main(String[] args) {
		
		
		try {
			
		
			System.out.println(args[0]);
			
		}catch(Exception e) {
			
		
			System.out.println("예외가 발생되었습니다.");
			
		}finally {
			
			
			System.out.println("항상 수행!!");
			
		}
	}

}
