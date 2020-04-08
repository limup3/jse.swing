package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		String message ="";
		while(true) {
			System.out.println();
			
			
			switch (JOptionPane.showInputDialog("0. 종료 1. 집 전화기 입력 2. 집 전화기 출력"
					+ "3. 휴대전화입력"
					+ "4. 휴대전화출력"
					+ "5. 아이폰 입력"
					+ "6. 아이폰 출력"
					+ "7. 갤럭시노트 입력"
					+ "8. 갤럭시노트 출력")) {
			case "0":
				return;
			case "1":

//				JOptionPane.showMessageDialog(null, values[0]);
				for (int i = 0; i < 3; i++) {
				String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company").split(",");	
				
				phoneService.add(new Phone(values[0],values[1],values[2]));
				}
				
				break;
			case "2":
				Phone[] phones = phoneService.getPhones();
				message ="";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호 : %s , 이름 : %s , 회사 : %s \n",phones[i].getPhoneNumber() , phones[i].getName(), phones[i].getCompany());
					
				}
				JOptionPane.showMessageDialog(null, message);
				break;	
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company, portable").split(",");	
					
					
					phoneService.add(new CelPhone(values[0],values[1],values[2],true));
					}
				break;	
			case "4":
				CelPhone[] celPhones = phoneService.getCelPhones();
				message ="";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호 : %s , 이름 : %s , 회사 : %s , 휴대가능 여부 : %s \n",
							celPhones[i].getPhoneNumber(), 
							celPhones[i].getName(), 
							celPhones[i].getCompany(),
							celPhones[i].getMove()
							);
					
				}
				JOptionPane.showMessageDialog(null, message);
				break;	
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company, portable, search").split(",");	
					
					
					phoneService.add(new Iphone(values[0], values[1], values[2], true, values[4]));
					}
				
				break;	
				
			case "6":
				Iphone[] iPhones = phoneService.getiPhones();
				message ="";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호 : %s , 이름 : %s , 회사 : %s , 휴대가능 여부 : %s , 검색 : %s \n ",
							iPhones[i].getPhoneNumber(), 
							iPhones[i].getName(), 
							iPhones[i].getCompany(),
							iPhones[i].getMove(),
							iPhones[i].getSearch()
							);
					
				}
				JOptionPane.showMessageDialog(null, message);
				
				break;	
				
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력 : phoneNumber, name, company, portable, search").split(",");	
					
					
					phoneService.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
					}
				
				break;	
			case "8":
				
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNotes();
				message ="";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호 : %s , 이름 : %s , 회사 : %s , 휴대가능 여부 : %s , 검색 : %s , 사이즈 : %s \n  ",
							galaxyNotes[i].getPhoneNumber(), 
							galaxyNotes[i].getName(), 
							galaxyNotes[i].getCompany(),
							galaxyNotes[i].getMove(),
							galaxyNotes[i].getSearch(),
							galaxyNotes[i].getBigSize()
							);
					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				
			case "9":
				break;	
			default:
				break;
			}
		}
	}
	
}
