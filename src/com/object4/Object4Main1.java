package com.object4;

public class Object4Main1 {
	public static void main(String []args) {
		
		Resume re = new Resume();
		
		Car car1 = new Car();
		//car1.company = "쌍용";
		car1.info();
		
		Car car2 = new Car("gray", "brand");
		car2.info();
		
	}
}
