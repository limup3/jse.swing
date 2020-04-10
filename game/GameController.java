package com.jse.game;

import java.util.Random;
import java.util.Scanner;
import com.jse.member.*;
//import com.jse.app.Calculator;
//import com.jse.app.Dice;
import com.jse.member.Kaup;
import com.jse.member.Member;
import com.jse.util.Calculator;


public class GameController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member(); // new = 새로운 메모리에서 만들어내라
		Calculator calculator = new Calculator();
		Dice dice = null;
		Random random = null;
//		RPSGame rpsGame = new RPSGame();
		RPSGame rpsGame = null;
		Kaup kaup = null;
//		String test = scanner.next();
		while (true) {
			System.out.println("0. 종료 "
					+ "1. 회원가입 "
					+ "2. 로그인 "
					+ "3. 계산기 "
					+ "4. 주사위 홀짝 맞추기 게임 "
					+ "5. 가위바위보 "
					+ "6. 카우프지수 "
					+ "7. 1부터 100까지의 합 "
					);
//			Scanner scanner = new Scanner(System.in);
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String id = scanner.next();
				member.setUserId(id);
				
				break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getUserId();
				System.out.println("로그인 된 아이디 : " + returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				
				System.out.println("계산기");
				System.out.print("첫번째 수 입력 : ");
				int first_num = scanner.nextInt();
				System.out.print("두번째 수 입력 : ");
				int second_num = scanner.nextInt();				
				calculator.setNum(first_num);
				calculator.setNum2(second_num);
//				int num1 = calculator.getNum();
//				int num2 = calculator.getNum2();
				int sum	= calculator.calculate();
				System.out.println("두수의 합 : " + sum);
				
				break;
			case 4:
				dice = new Dice();
				System.out.println("주사위 홀짝 맞추기 게임");
				System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
				String expect = scanner.next();
				dice.setExpect(expect);
//				String expect2 = dice.getExpect();
				System.out.println(String.format("사용자가 입력한 값: %s ", expect));
				int random_dice = random.nextInt(6)+1;
				dice.setDiceNumber(random_dice);
//				int dice2 = dice.getDice();
				dice.switchDice();
				
				break;
			case 5:
				rpsGame = new RPSGame();
				System.out.println("가위 1, 바위 2, 보 3 을 입력하세요.");
				int user = scanner.nextInt();
				System.out.println("사용자의 값은 "+ user + "입니다.");
				rpsGame.setUser(user);
				int computer = random.nextInt(3)+1;	
				System.out.println("컴퓨터의 값은" +computer + "입니다.");
				rpsGame.setComputer(computer);
				String GameResult = rpsGame.game();
				System.out.println("결과 : " + GameResult);
				break;
			case 6:
				kaup = new Kaup();
				System.out.println("키를 소수점 단위로 입력하세요(ex = 180cm -> 1.8m)");
				kaup.setUserHeight(scanner.nextFloat());
				System.out.println("몸무게를 입력하세요(ex = 70kg -> 70kg)");
				kaup.setUserWeight(scanner.nextFloat());
				kaup.calc();
//				String result = kaup.calc();
				System.out.println("카우프 지수 :" + kaup.getUserWeight()/(kaup.getUserHeight()*kaup.getUserHeight()));
				System.out.println("결과 : " + kaup.calc());				
				break;
//				
			}
//break;
		}
	}
	
//	static void switchDice() {
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println(String.format("사용자가 입력한 값: %s ", expect));
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
//		String result = "";
//		System.out.println(String.format("주사위값 결과 : %d ", dice));
//		switch(dice)
//		{
//		case 1: case 3: case 5: result = "홀";		
//		break;
//		case 2: case 4: case 6: result = "짝";		
//		break;
//		
//		}
//		
//		System.out.println("홀짝 결과: " + result);
//		
//		if(expect.equals(result)) // object type operation method
//		{
//			System.out.println("맞춤");
//		}
//		else
//		{
//			System.out.println("틀림");
//		}
//		
//	}
//	
//	static void game() {
//		System.out.println("가위 1, 바위 2, 보 3 을 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		int user = scanner.nextInt();
//		System.out.println("사용자의 값은 "+ user + "입니다.");
//		Random random = new Random();
//		int computer = random.nextInt(3)+1;		
//		System.out.println("컴퓨터의 값은" +computer + "입니다.");
//		
////		if(user == computer) {
////			System.out.println("비겼습니다.");
////		}
////		else if(user == 1 && computer == 3) {
////			System.out.println("사용자가 승리하였습니다.");
////		}
////		else if(user == 1 && computer == 2) {
////			System.out.println("컴퓨터가 승리하였습니다.");
////		}
////		else if(user == 2 && computer == 1) {
////			System.out.println("사용자가 승리하였습니다.");
////		}
////		else if(user == 2 && computer == 3) {
////			System.out.println("컴퓨터가 승리하였습니다.");
////		}
////		else if(user == 3 && computer == 1) {
////			System.out.println("컴퓨터가 승리하였습니다.");
////		}
////		else if(user == 3 && computer == 2) {
////			System.out.println("사용자가 승리하였습니다.");
////		}
////		else {
////			System.out.println("");
////		}
//		
//		if (user == computer) {
//			System.out.println("비겼습니다.");
//		}
//		else if(user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2 ) {
//			System.out.println("사용자가 승리하였습니다.");
//		}
//		else if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1 ) {
//			System.out.println("컴퓨터가 승리하였습니다.");
//		}
//		else {
//			System.out.println("잘못입력하였습니다.");
//		}
//		
//	}
//	
//	static void sum() {
//		System.out.println("1부터 100까지 합 구하기");
//		int total = 0;
//		for (int i = 1 ; i<=100 ; i++) {
//			total += i;
//		}
//		System.out.println(total);
//	}
}
