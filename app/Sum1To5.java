package com.jse.app;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {

		int total = 0;
		for(int i = 1 ; i<=5 ; i++) {
			
//			total = total + i;
			total += i;
			
		}
	System.out.println(total);
	}
}
