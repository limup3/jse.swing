package com.jse.member;

import com.jse.card.Card;

public class MemberServiceImpl implements MemberService {

	private Member[] members;
	private int count;
	
	
	
	public MemberServiceImpl() {
		members = new Member[5];
	
	}
	
	public Member[] getMembers() {
		return members;
	}
	public void setMembers(Member[] members) {
		this.members = members;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public String printMember() {
		String result = "";
	
		Member[] members = getMembers();
		for (int i = 0; i < members.length; i++) {
			
			result += String.format("이름 : %s , 아이디 : %s , 패스워드 : %s , 주민번호 : %s" +"\n",
					members[i].getName(),
					members[i].getUserid(),
					members[i].getPasswd(),
					members[i].getSsn()
					); 
					
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		Member[] members = getMembers();
		for (int i = 0; i < members.length; i++) {
			
			result += String.format("이름 : %s , 아이디 : %s , 패스워드 : %s , 주민번호 : %s" +"\n",
					members[i].getName(),
					members[i].getUserid(),
					members[i].getPasswd(),
					members[i].getSsn()
					); 
					
		}
		
		return result;
	}
	
	
}
