package com.object1.ex1;

import java.io.InputStream;
import java.util.Scanner;

public class StudentController {
	
	//start 메서드 선언
	//System.out.println("1. 학생 정보 입력");
	//System.out.println("2. 학생 정보 조회");
	//System.out.println("3. 학생 정보 검색");
	//System.out.println("4. 학생 정보 삭제");
	//System.out.println("5. 학생 정보 추가");
	//System.out.println("6. 프로 그램 종료");
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	StudentView sv = new StudentView();
	Student [] students = null;
	
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생 정보 입력, 2. 학생 정보 조회, 3. 학생 정보 검색, 4. 학생 정보 삭제, 5. 학생 정보 추가, 6. 프로 그램 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("1. 학생 정보 입력");
				students = ss.makeStudents();
			}else if(select == 2) {
				System.out.println("2. 학생 정보 조회");
				sv.view(students);
			}else if(select == 3) {
				System.out.println("3. 학생 정보 검색");
				Student student = ss.findStudent(students);
				
				if(students != null) {
					sv.view(student);
				}else if(students == null) {
					sv.view("찾는 번호는 없습니다.");
				}
				
				
			}else if(select == 4) {
				System.out.println("4. 학생 정보 삭제");
			}else if(select == 5) {
				System.out.println("5. 학생 정보 추가");
			}else if(select == 6) {
				System.out.println("6. 프로 그램 종료");
				check = false; 
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
}
