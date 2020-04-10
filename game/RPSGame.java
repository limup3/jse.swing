package com.jse.game;

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
		

	}
}
