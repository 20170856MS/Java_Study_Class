package com.object1.ex1;

import java.util.Scanner;

public class StudentService {
	//makeStudents
	//학생수를 입력받고 학생수만큼 정보를 입력받는다.
	//학생들을 리턴
	public Student [] makeStudents(){
		System.out.println("학생 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Student [] students = new Student[num];
		
	
		
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("=======================");
			System.out.println("학생의 이름을 입력하세요");
			student.name=sc.next();
			System.out.println("학생의 번호를 입력하세요");
			student.number=sc.nextInt();
			System.out.println("학생의 국어점수를 입력하세요");
			student.kor=sc.nextInt();
			System.out.println("학생의 영어점수를 입력하세요");
			student.eng=sc.nextInt();
			System.out.println("학생의 수학점수를 입력하세요");
			student.math = sc.nextInt();
			student.total = student.kor+student.eng+student.math;
			student.avg =student.total/3 ;
			students[i]=student;
			
		}
		return students;
		
		
	}
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생 한명을 리턴
	//없으면 null을 리턴
	public Student findStudent(Student [] students) {

		System.out.println("찾는 학생의 번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		//리턴하려는 학생 데이터
		Student student=null;
		
		for(int i=0;i<students.length;i++) {
			if(students[i].number == search) {
				student = students[i];
				break;
			}
		}
		return student;
		
	}
}
