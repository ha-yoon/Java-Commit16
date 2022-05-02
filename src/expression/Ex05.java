package expression;

import java.util.Scanner;
import java.util.regex.Pattern;

class Profile {
	
	String name;
	int age;
	String tel;
	String email;
	
	public Profile(String name, int age, String tel, String email) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}

	public void profilePrint() {
		
		System.out.println(name + "님의 프로필");
		System.out.println("나이: " + age);
		System.out.println("전화번호: " + tel);
		System.out.println("이메일: " + email);
	}


}



public class Ex05 {

	public static void main(String[] args) {
		
		// Scanner로 이름 나이 전화번호 이메일 입력받기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("프로필 등록을 위해 개인정보를 입력해주세요.");
		System.out.println("형식이 올바르지 않을 경우 등록이 불가합니다.");
		System.out.println("나이는 20 ~ 60살까지 입력해주세요~!");
		
		System.out.println("이름: ");
		System.out.println("예)홍길동");
		String name = scan.next();
		
		System.out.println("나이: ");
		System.out.println("예)25");
		int age = scan.nextInt();
		
		System.out.println("전화번호: ");
		System.out.println("예)010-0000-0000");
		String tel = scan.next();
		
		System.out.println("이메일: ");
		System.out.println("예)abcde@aaaa.com");
		String email = scan.next();
		

		// 이름 전화번호 이메일은 정규표현식을 사용해서 올바르게 입력 받았는지 알아보기

		boolean nameCheck = Pattern.matches("[가-힣]*", name);
		
		// 나이는 입력받고 if문으로 20살부터 60살까지 유효성 검사를 해보자 
		boolean ageCheck;
		
		if(age < 20 || age > 60) {
			ageCheck = false;
		}else {
			ageCheck = true;
		}
		
		boolean telCheck = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", tel);
	
		boolean emailCheck = Pattern.matches("\\\\w+@\\\\w+\\\\.\\\\w+(\\\\.\\\\w+)?", tel);

		if(nameCheck == false ) {
			System.out.println("이름을 잘못 입력 하였습니다.");
		}
		
		if(ageCheck == false) {
			System.out.println("나이를 잘못 입력 하였습니다.");
		}
		
		if(telCheck == false) {
			System.out.println("전화번호를 잘못 입력 하였습니다.");
		}
		
		if(emailCheck == false) {
			System.out.println("이메일을 잘못 입력 하였습니다.");
		}
		
		
		// 모두 올바르게 입력 받았다면 Profile 클래스의 인스턴스 생성 후
		// ProfilePrint 메소드 호출하기 
		if(nameCheck == true && ageCheck == true && 
				telCheck == true && emailCheck == true) {
			
			Profile profile = new Profile(name, age, tel, email);
			System.out.println("프로필이 정상적으로 등록되었습니다.");
			profile.profilePrint();
		}else {
			System.out.println("프로필이 등록되지 않았습니다.");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
