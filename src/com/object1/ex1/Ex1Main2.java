package com.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i=0;i<students.length;i++) {
			Student st = new Student();
			students[i] = st;
			System.out.println("이름 입력");
			students[i].name = sc.next();  //st.name = sc.next();
		}
		
		for(int i =0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
		
		
		System.out.println("프로그램 종료");
	}

}
