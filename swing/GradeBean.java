package com.jse.swing;

/*
 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 이름과 국,영,수 세과목점수를 입력받아서() 
[홍길동 : 총점 ***점, * 평균***점,학점 : F]을 
 출력하는 프로그램을 만들어 주세요. 
 단) 평균은 소수점이하는 절삭합니다 
 평균점수가 90점 이상 A 
 80점 이상이면 B 
 70점 이상이면 C 
 60점 이상이면 D 
 50점 이상이면 E 
 50점 미만이면 F 
 학점입니다라고 출력되게 해주세요 
 * */

public class GradeBean {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public GradeBean(String name , int kor , int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public int sum() {
		
		return kor+math+eng;
	}
	
	public int avg() {
		
		return sum()/3;
	}
	
	public String calc2() {
		String result = "";
				
		
		switch (result) {
		case "A":
			
			break;
		case "B":
			
			break;
		case "C":
	
			break;
			
			

		default:
			break;
		}
		
		return result;
	}
	
	public String calc() {
		String result = "";
		
		int avg = avg();
		
		if(avg >= 90) {
			result = "A";
		} else if(avg >= 80 && avg < 90) {
			result = "B";
		} else if(avg >= 70 && avg < 80) {
			result = "C";
		} else if(avg >= 60 && avg < 70) {
			result = "D";
		} else if(avg >= 50 && avg < 60) {
			result = "E";
		} else if( avg < 50) {
			result = "F";
		} else {
			result = "잘못된 값입니다.";
		}
		
		return result;
	}
	
	
}
