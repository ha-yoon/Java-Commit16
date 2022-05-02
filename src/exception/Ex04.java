package exception;

public class Ex04 {

	public static void call(int value) throws ArrayIndexOutOfBoundsException {
		
		int[] i = {1, 2, 3};
		System.out.println("call value: " + i[value]);
	}

	
	
	public static void main(String[] args) {
		try {
		call(7);
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("배열 크기에 맞는 값을 입력하세요.");
		ae.printStackTrace(); // 에러내용 화면에 출력
	}finally {
		System.out.println("해당 문장은 무조건 수행");
	}

}
}