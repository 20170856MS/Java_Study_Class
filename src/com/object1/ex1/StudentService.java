package com.object1.ex1;

import java.util.Scanner;

public class StudentService {
	//makeStudents
	//학생수를 입력받고 학생수만큼 정보를 입력받는다.
	//학생들을 리턴
	Scanner sc;
	
	public StudentService () {
		sc = new Scanner(System.in);
	}
	
	public Student [] makeStudents(){
		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();
		
		Student [] students = new Student[num];
		Student st = new Student();
	
		
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("=======================");
			System.out.println("학생의 이름을 입력하세요");
			
			student.setName(sc.next());
			System.out.println("학생의 번호를 입력하세요");
			student.setNumber(sc.nextInt());
			System.out.println("학생의 국어점수를 입력하세요");
			student.setKor(sc.nextInt());
			System.out.println("학생의 영어점수를 입력하세요");
			student.setEng(sc.nextInt());
			System.out.println("학생의 수학점수를 입력하세요");
			student.setMath(sc.nextInt());
			st.setTotal();
			
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
			if(students[i].getNumber() == search) {
				student = students[i];
				break;
			}
		}
		return student;
		
	}
	
	//removeStudent
	//학생들의 정보를 받아서 삭제하려는 학생의 번호를 입력받음
	//학생의 번호와 일치하는 학생을 삭제, 남은 학생정보들을 리턴
	
	
	
	
	//addStudent
		//힉셍들의 정보를 받아서
		//학생 한명 추가
		//학생정보들을 리턴
		
		public Student [] addStudent(Student [] students) {
			Student [] students2 = new Student[students.length+1];
			Student st2 = new Student();
			
			Student student2 = new Student();
			System.out.println("=======================");
			System.out.println("학생의 이름을 입력하세요");
			student2.setName(sc.next());
			System.out.println("학생의 번호를 입력하세요");
			student2.setNumber(sc.nextInt());
			System.out.println("학생의 국어점수를 입력하세요");
			student2.setKor(sc.nextInt());
			System.out.println("학생의 영어점수를 입력하세요");
			student2.setEng(sc.nextInt());
			System.out.println("학생의 수학점수를 입력하세요");
			student2.setMath(sc.nextInt());
			st2.setTotal();
			
			
			students = students2;
			
			
			return students;
		}
		
	
	
	
	
}
