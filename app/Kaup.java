package com.jse.app;


/*
 개발자님 키와 몸무게를 이용하여
 카우푸지수를 구하고
 그결과 정상 , 저체중 , 비만 등으로 몸의 상태만
 알려주는 프로그램을 만들어주세요  
 
 카우프지수=체중(g)/신장2(cm)
 22이상은 지나친 비만, 22~19가 우량, 
 19~15가 정상, 
 15~13이 마른것, 
 13~10이 영양실조, 
 10이하가 소모증으로 판정된다
 */

public class Kaup {
	private float height;
	private float weight;
	
	public void setUserHeight(float height) {
		this.height = height;
	}
	
	public float getUserHeight() {
		return height;
	}
	
	public void setUserWeight(float weight) {
		this.weight = weight;
	}
	
	public float getUserWeight() {
		return weight;
	}
	
	public String calc() {
		float kaupIndex = 0;
		
		kaupIndex = weight/(height*height);
		
		String result = "";
		
		if(kaupIndex >= 22) {
			result = "지나친 비만";
		}
		else if(19 < kaupIndex && 22 >= kaupIndex) {
			result = "우량";
		}
		else if(15 < kaupIndex && 19 >= kaupIndex) {
			result = "정상";
		}
		else if(13 < kaupIndex && 15 >= kaupIndex) {
			result = "마른것";
		}
		else if(10 < kaupIndex && 13 >= kaupIndex) {
			result = "영양실조";
		}
		else if(kaupIndex <= 10) {
			result = "소모증";
		}
		else {
			result = "잘못된 값";
		}
//		System.out.println("카우푸지수 : " + kaupIndex);
//		System.out.println("결과 : " + result);
		return result;
	}
}
