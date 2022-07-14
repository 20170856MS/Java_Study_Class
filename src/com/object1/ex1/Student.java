package com.object1.ex1;

public class Student  {
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	//파란색 : 멤버변수
	//갈색 : 지역변수
	//this 만들어진 객체의 주소를 담고있다(만들어진 객체의 자기자신) 생략가능
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	
	private int checkPoint(int point) {
		if(point < 0 || point >100) {
			return 0;
		}
		return point;
	}
	
	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
		//this => 멤버변수 >지역변수와 멤버변수를 구분
		this.setAvg();
	}


	private void setAvg() {
		this.avg = this.total/3;
	}
}
