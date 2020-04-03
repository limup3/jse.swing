package com.jse.app;

import java.util.Scanner;
import java.util.Random;
public class Dice {

	private int diceNumber;
	private String expect;
	
	public void setDiceNumber(int dice) {
		this.diceNumber = dice;
	}
	
	public int getDiceNumber() {
		return diceNumber;
	}
	
	public void setExpect(String expect) {
		this.expect = expect;
	}
	
	public String getExpect() {
		return expect;
	}
	
	
		public String switchDice() {
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println(String.format("사용자가 입력한 값: %s ", expect));
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
		String result = "";
		System.out.println(String.format("주사위값 결과 : %d ", diceNumber));
		switch(diceNumber)
		{
		case 1: case 3: case 5: result = "홀";		
		break;
		case 2: case 4: case 6: result = "짝";		
		break;
		}
		String result2 = "틀림";
		
		if(expect.equals(result)) // object type operation method
		{
			result2 = "맞음";
		}
		System.out.println("결과 :" + result2);
		return result2;
	}
	
	
//	static void switchDice() {
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println(String.format("사용자가 입력한 값: %s ", expect));
////		System.out.println("예상값은 : " + expect);		
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
////		int dice = (int)(Math.random()*6+1);
//		System.out.println(dice);
//		String result = "";
//		switch(dice)
//		{
//		case 1:
//			result = "홀";
//			break;
//		case 2:
//			result = "짝";
//			break;
//		case 3:
//			result = "홀";
//			break;
//		case 4:
//			result = "짝";
//			break;
//		case 5:
//			result = "홀";
//			break;
//		case 6:
//			result = "짝";
//			break;
//		default:
//			System.out.println("그외 숫자");
//		}
//		System.out.println("홀짝 결과: " + result);
//		
//
////		
////		if(expect.equals(result)) // object type operation method
////		{
////			System.out.println("맞춤");
////		}
////		else
////		{
////			System.out.println("틀림");
////		}
//		
//	}
//	static void ifDice() {
//		//메소드 형태
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println("예상값은 : " + expect);		
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
////		int dice = (int)(Math.random()*6+1);
//		System.out.println(dice);
//		String result = "";
//		if(dice == 1) {
//			result = "홀";
//		}else if(dice == 2) {
//			result = "짝";
//		}else if(dice == 3) {
//			result = "홀";
//		}else if(dice == 4) {
//			result = "짝";
//		}else if(dice == 5) {
//			result = "홀";
//		}else{
//			result = "짝";
//		}
////		if(dice%2 == 0 )
////		{
////			result = "짝";
////		}
////		else if(dice%2 != 0)
////		{
////			result = "홀";
////		}
//		
//		System.out.println("홀짝 결과: " + result);
//		if(expect.equals(result)) // object type operation method
//		{
//			System.out.println("맞춤");
//		}
//		else
//		{
//			System.out.println("틀림");
//		}
//	}
}
