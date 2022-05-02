package expression;

import java.util.regex.Pattern;

public class Ex01 {

	public static void main(String[] args) {
		
		String pattern = "^[0-9]*$";
		
		String number = "123456";
		
		if(Pattern.matches(pattern,number)) {
		// Pattern.matches(정규표현식,검증할문자열)	
			System.out.println("숫자만 포함되어 있습니다.");
		}else {
			
		}System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
		

	}

}
