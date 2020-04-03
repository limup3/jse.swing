package com.jse.swing;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		while(true) {
			System.out.println(""
					+ "0. 종료 "
					+ "1. 학점계산기"
					+ "2. 진행"
					);
			
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				grade = new Grade();
				System.out.println("이름을 입력해주세요");
				grade.setName(scanner.next());
				System.out.println("국어 점수 입력");
				grade.setKor(scanner.nextInt());
				System.out.println("영어 점수 입력");
				grade.setEng(scanner.nextInt());
				System.out.println("수학 점수 입력");
				grade.setMath(scanner.nextInt());
				System.out.println("");
				System.out.println(
						 "[ 이름 : " + grade.getName()
				+ ", "  + "총점 : " + grade.sum() 
				+ "점, " + "평균 : " + grade.avg()
				+ "점, " + "학점 : " + grade.calc() +" ]" );
				System.out.println("");
//				System.out.println(String.format("[홍길동 : 총점 %d 점, * 평균 %d점,학점 : %s]",
//						grade.getName(), grade.sum(),grade.avg(),grade.calc()));
				
				break;	
	
			default:
				break;
		}
	}
}
	
	
}
