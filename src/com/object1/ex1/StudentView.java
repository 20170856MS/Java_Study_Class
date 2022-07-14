package com.object1.ex1;

import java.util.Scanner;

public class StudentView {
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	
	//viewMessage 문자열을 받아서 그 문자열을 출력
	
	//viewOne 학생 한명의 정보를 받아서 모든 정보를 출력
	Scanner sc = new Scanner(System.in);
	
	
	public void view(Student [] students) {

		
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총합\t평균");
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i].getName()+"\t");
			System.out.print(students[i].getNumber()+"\t");
			System.out.print(students[i].getKor()+"\t");
			System.out.print(students[i].getEng()+"\t");
			System.out.print(students[i].getMath()+"\t");
			System.out.print(students[i].getTotal()+"\t");
			System.out.print(students[i].getAvg()+"\t");
			System.out.println("");
			
		}
	}
	
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Student students) {
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총합\t평균");
		System.out.print(students.getName()+"\t");
		System.out.print(students.getNumber()+"\t");
		System.out.print(students.getKor()+"\t");
		System.out.print(students.getEng()+"\t");
		System.out.print(students.getMath()+"\t");
		System.out.print(students.getTotal()+"\t");
		System.out.print(students.getAvg()+"\t");
	}
	
}
