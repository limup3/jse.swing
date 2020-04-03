package com.jse.app;

public class Member {
	private String id; // 참조주소 , 인스턴스 변수 , 멤버변수

	public Member() { // 생성자
		
	}

	public void setId(String id) { // 인스턴스 메소드 , 파라미터는 로컬변수
		System.out.println("지역변수 들어옴: " + id);
		this.id = id;
		System.out.println("인스턴스변수에 저장됨: " + this.id);
		
	}
	
	public String getId() {
		return this.id;
	}
}
