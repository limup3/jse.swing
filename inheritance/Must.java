package com.jse.inheritance;

import java.util.Scanner;

public class Must {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0. 종료 1. 진행");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("진행");
				break;

			default:
				break;
			}
		}
	}
	
}
