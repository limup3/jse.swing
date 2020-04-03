package com.jse.app;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
	
		find();
	
	}
	static void find() {
	System.out.println("주민번호를 입력하세요 .");
	Scanner scanner = new Scanner(System.in);	
	String ssn = scanner.next();
//	System.out.println(ssn);
	char ch = ssn.charAt(7);
	int ch2 = Character.getNumericValue(ch);
	System.out.println(ch);
	//ch가 1이나 3일때 남성
	switch(ch)
	{
	case '1': case '3':
		System.out.println("남성");
	break;
	case '2': case '4': 
		System.out.println("여성");
	break;	
	case '5': case '6': 
		System.out.println("외국인");
	break;
	default: 
		System.out.println("잘못된 값");
	break;
	
	}
//	if(ch2 == 1 || ch2 == 3)
//	{
//		System.out.println("남성");
//	}
	
	
//	System.out.println("남성"); // 1, 3
//	System.out.println("여성"); // 2, 4
//	System.out.println("외국인"); // 5, 6
//	System.out.println("잘못된 값"); // 0, 7, 8, 9 
	}
}
