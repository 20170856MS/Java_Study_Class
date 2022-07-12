package com.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Student std1 = new Student();
		std1.name = "가나다";
		std1.number = 1;
		std1.kor = 90;
		std1.eng = 80;
		std1.math = 70;
		std1.total= std1.kor+std1.eng+std1.math;
		std1.avg = std1.total/3;
		
		Student std2 = new Student();
		std2.name = "라마바";
		std2.number = 2;
		std2.kor = 75;
		std2.eng = 95;
		std2.math = 80;
		std2.total= std1.kor+std1.eng+std1.math;
		std2.avg = std1.total/3;
		
		
		Student std = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int num = sc.nextInt();
		
		Student [] students = new Student[num];
		for(int i =0; i<num; i++) {
			std = new Student();
			System.out.println("이름입력");
			std.name = sc.next();
			students[i]=std;
			
		}
		System.out.println(students[0].name);
		
		
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총합\t평균");
		System.out.println(std1.name+"\t"+std1.number+"\t"+std1.kor+"\t"+std1.eng+"\t"+std1.math+"\t"+std1.total+"\t"+std1.avg);
		System.out.println(std2.name+"\t"+std2.number+"\t"+std2.kor+"\t"+std2.eng+"\t"+std2.math+"\t"+std2.total+"\t"+std2.avg);
		
		System.out.println("프로그램 종료");
	}

}
