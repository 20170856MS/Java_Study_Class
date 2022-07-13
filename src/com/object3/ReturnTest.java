package com.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	//makeAccount
	//title host 통장번호 잔액 입력받아서 리턴
	public Account makeAccount() {
		Account acc = new Account();
		acc.title=sc.next();
		acc.host=sc.next();
		acc.numbers=sc.next();
		acc.money = sc.nextLong();
		
		return acc;
	}
	
	public int [] makeRandom2(int count) {
		//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
		System.out.println("숫자를 입력하세요. :");
		int co = sc.nextInt();
		int [] rdd = new int [co];
		
		for (int i=0; i<co; i++) {
			int rd = random.nextInt(50);
			rdd[i]= rd;
			rdd [i] = random.nextInt(50);
		}
		
		return rdd;
	}
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		return num;  //return 리턴할려는 Data
	}
	
	public void info() {
		System.out.println("실행 후 종료");
	}
}
