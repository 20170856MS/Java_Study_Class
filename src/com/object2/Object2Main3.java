package com.object2;

import java.util.Scanner;

public class Object2Main3 {
	public static void main(String [] args) {
		
		Method3 m3 = new Method3();
		//월급입력
		int salary = 5000000;
		
		m3.sal(salary);
		m3.hap(50, 120);
		System.out.println(salary);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("이메일주소를 입력하세요.");
		String email = sc.next();
		
		m3.info(name,age,email);
		
		Member member = new Member();
		member.name="가나다";
		member.age=30;
		member.email="asdf@naver.com";
		member.Phone = "01012345678";
		m3.info2(member);
		System.out.println(member.age);
	}
	
	
}
