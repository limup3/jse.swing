package com.jse.util;

//import java.util.Scanner;

public class Calculator {
	private int num1;
	private int num2;
	private int sum;
	
	public void setNum(int num1) {
		this.num1 = num1;
		
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	public int calculate() {
		// 첫번째 수 입력
		// 두번째 수 입력
		// 두수의 합은 ?
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫번째 수 입력 : ");
//		int first_num = scanner.nextInt();
//		System.out.print("두번째 수 입력 : ");
//		int second_num = scanner.nextInt();
		this.sum = this.num1 + this.num2;
		return sum;
		
	}
	


}
