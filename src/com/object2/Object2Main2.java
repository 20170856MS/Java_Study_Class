package com.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnimalSound sound = new AnimalSound();
		
		System.out.println("1. Dog, 2. Cat, 3. Tiger");
		int select = sc.nextInt();
		System.out.println("횟수를 입력하세요");
		int count = sc.nextInt();
		
		if(select == 1) {
			for(int i=0;i<count;i++) {
				sound.dogSound();
			}
		}else if(select == 2) {
			for(int i=0;i<count;i++) {
				sound.catSound();
			}
		}else if(select == 3) {
			for(int i=0;i<count;i++) {
				sound.tigerSound();
			}
		}else {
			System.out.println("없는 번호입니다.");
		}
		
		
	}

}
