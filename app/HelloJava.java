package com.jse.app;
import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭐에요 ?");
		String name = scanner.next();
		System.out.println("안녕하세요 " + name+ "씨");
		System.out.println("몇 살이에요 ?");
		int age = scanner.nextInt();
		//Integer
		System.out.println(age + "살 이에요");
		System.out.println("키는 몇이고 , 몸무게는 몇 kg 입니까 ?");
		float height = scanner.nextFloat();
		//Float
		double weight = scanner.nextDouble();
		//Double
		System.out.println("혈액형이 뭐에요 ?");
		char bloodtype = scanner.next().charAt(0);
		
	}
}
