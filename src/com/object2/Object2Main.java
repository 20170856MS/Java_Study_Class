package com.object2;

import java.util.Scanner;

public class Object2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 시작");
		
		
		Method1 mt1 = new Method1();
		mt1.test();
		
		Method2 mt2 = new Method2();
		mt2.info();
		
		
		System.out.println("프로그램 종료");
	}

}
