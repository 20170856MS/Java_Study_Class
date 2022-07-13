package com.object2;

import java.util.Scanner;

public class Method4 {
	
	//info 맴버들의 정보를 출력
	
	public void info(Member [] members) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<members.length;i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
		}
		
		members = new Member[2];
		System.out.println(members.length);
	}
	
}
