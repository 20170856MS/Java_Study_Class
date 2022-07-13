package com.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student1 [] students = new Student1[3];
		
		for(int i=0;i<students.length;i++) {
			System.out.println("이름 입력");
			students[i].name = sc.next();  //st.name = sc.next();
			Student1 st = new Student1();
			students[i] = st;
		}
		
		for(int i =0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
		
		
		System.out.println("프로그램 종료");
	}

}
