package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
	
	private int user; // state, instance 변수 , 속성
	private int computer;
	
	public void setUser(int user) { // behavior , 기능
		this.user = user;
	}
	
	public int getUser() {
		return user;
	}
	
	public void setComputer(int computer) {
		this.computer = computer;
	}
	
	public int getComputer() {
		return computer;
	}
	
	 public String game() {
//		System.out.println("가위 1, 바위 2, 보 3 을 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		int user = scanner.nextInt();
//		System.out.println("사용자의 값은 "+ user + "입니다.");
//		Random random = new Random();
//		int computer = random.nextInt(3)+1;		
//		System.out.println("컴퓨터의 값은" +computer + "입니다.");
		 
		 String result = "";
		
		if (user == computer) {
			
			result = "비겼습니다.";
		}
		else if(user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2 ) {
			result = "사용자가 승리하였습니다.";
		}
		else if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1 ) {
			result = "컴퓨터가 승리하였습니다.";
		}
		else {
			result = "잘못입력하였습니다.";
		}
		
		
		
		return result;
	
		
//		if(user == computer) {
//			System.out.println("비겼습니다.");
//		}
//		else if(user == 1 && computer == 3) {
//			System.out.println("사용자가 승리하였습니다.");
//		}
//		else if(user == 1 && computer == 2) {
//			System.out.println("컴퓨터가 승리하였습니다.");
//		}
//		else if(user == 2 && computer == 1) {
//			System.out.println("사용자가 승리하였습니다.");
//		}
//		else if(user == 2 && computer == 3) {
//			System.out.println("컴퓨터가 승리하였습니다.");
//		}
//		else if(user == 3 && computer == 1) {
//			System.out.println("컴퓨터가 승리하였습니다.");
//		}
//		else if(user == 3 && computer == 2) {
//			System.out.println("사용자가 승리하였습니다.");
//		}
//		else {
//			System.out.println("");
//		}		

	}
}
