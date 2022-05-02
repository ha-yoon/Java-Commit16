package expression;

import java.util.regex.Pattern;

public class Ex04 {

	public static void main(String[] args) {
		
		String pattern = "[가-힣]*";
		
		String koreaName = "홍길동";
		
		
		if(Pattern.matches(pattern, koreaName)) {
			System.out.println("올바른 한글이름 입니다.");
		}else {
			System.out.println("올바른 한글 이름이 아닙니다.");
		}

	}

}
