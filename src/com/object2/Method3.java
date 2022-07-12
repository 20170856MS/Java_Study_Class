package com.object2;

public class Method3 {
	
	public void sal(int salary) {
		
		System.out.println("월급 계산");
		System.out.println(salary*0.9677);
		salary=20;
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//info : 이름 나이 이메일 주소를 받아서 출력하는 메서드
	public void info(String name, int age, String email) {
		System.out.println("이름 :"+name );
		System.out.println("나이 :"+age );
		System.out.println("이메일 :"+email );
	}
	
	public void info2(Member member) {
		System.out.println("이름 :"+member.name );
		System.out.println("나이 :"+member.age );
		System.out.println("이메일 :"+member.email );
		System.out.println("전화번호 : "+member.Phone);
	}

}
