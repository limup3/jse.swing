package com.jse.swing;

import java.util.Scanner;

import com.sun.glass.ui.Pixels.Format;

public class Engine {
	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[3];
		Member[] members = new Member[3];
//		Grade grade = new Grade();
		while (true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력 3. 성적표나열 4. 회원가입 5.회원목록 보기");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:

				System.out.println("성적표 입력");
				for (int i = 0; i < 3; i++) {
					grades[i] = input(scanner);
				}
				break;
			case 2:
				System.out.println("성적표 출력");
				for (int i = 0; i < 3; i++) {
					Grade grade = grades[i];

					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", grade.getName(), grade.sum(),
							grade.avg(), grade.calc()));
				}

				break;
			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");

				if (grades[0].sum() > grades[1].sum() && grades[0].sum() > grades[2].sum()
						&& grades[1].sum() > grades[2].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
				} else if (grades[1].sum() > grades[0].sum() && grades[1].sum() > grades[2].sum()
						&& grades[2].sum() > grades[0].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
				} else if (grades[2].sum() > grades[0].sum() && grades[2].sum() > grades[1].sum()
						&& grades[1].sum() > grades[0].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
				} else if (grades[0].sum() > grades[1].sum() && grades[0].sum() > grades[2].sum()
						&& grades[2].sum() > grades[1].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
				} else if (grades[1].sum() > grades[0].sum() && grades[1].sum() > grades[2].sum()
						&& grades[0].sum() > grades[2].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
				} else if (grades[2].sum() > grades[0].sum() && grades[2].sum() > grades[1].sum()
						&& grades[0].sum() > grades[1].sum()) {
					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
				} else {
					System.out.println("잘못입력하셧습니다.");
				}

				break;

			case 4:
				System.out.println("회원가입");
				for(int i = 0 ; i<3 ; i ++) {
					members[i] = join(scanner);
				}
				break;
			case 5:
				System.out.println("회원 목록 보기");
				for(int i = 0 ; i<3 ; i ++) {
					Member member = members[i];
					
					System.out.println(String.format("아이디 : %s , 패스워드 : %s , 이름 : %s , 나이 : %d ", member.getUserId(),member.getPasswd(),member.getName(),member.getAge()));
				}
				break;
			case 6:
				System.out.println("회원 목록 나이순 출력");
				
//				String result = "";
//				if (members[0].getAge() > members[1].getAge() && members[0].getAge() > members[2].getAge()
//						&& members[1].getAge() > members[2].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//				} else if (members[1].getAge() > members[0].getAge() && members[1].getAge() > members[2].getAge()
//						&& members[2].getAge() > members[0].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//				} else if (members[2].getAge() > members[0].getAge() && members[2].getAge() > members[1].getAge()
//						&& members[1].getAge() > members[0].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//				} else if (members[0].getAge() > members[1].getAge() && members[0].getAge() > members[2].getAge()
//						&& members[2].getAge() > members[1].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//				} else if (members[1].getAge() > members[0].getAge() && members[1].getAge() > members[2].getAge()
//						&& members[0].getAge() > members[2].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//				} else if (members[2].getAge() > members[0].getAge() && members[2].getAge() > members[1].getAge()
//						&& members[0].getAge() > members[1].getAge()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", members[2].getName(), members[2].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[0].getName(), members[0].getAge()));
//					System.out.println(String.format("%s : 총 %d 점 ,", members[1].getName(), members[1].getAge()));
//				} else {
//					System.out.println("잘못입력하셧습니다.");
//				}
				break;	
			}

		}
	}

	static Grade input(Scanner scanner) {

		Grade grade = new Grade();
		System.out.println("");
		System.out.println("이름");
		grade.setName(scanner.next());
		System.out.println("국어점수");
		grade.setKor(scanner.nextInt());
		System.out.println("영어점수");
		grade.setEng(scanner.nextInt());
		System.out.println("수학점수");
		grade.setMath(scanner.nextInt());

		System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", grade.getName(), grade.sum(), grade.avg(),
				grade.calc()));

		return grade;
	}

	static Member join(Scanner scanner) {

		Member member = new Member();

		System.out.println("아이디를 입력하세요");
		member.setUserId(scanner.next());
		System.out.println("패스워드를 입력하세요");
		member.setPasswd(scanner.next());
		System.out.println("이름를 입력하세요");
		member.setName(scanner.next());
		System.out.println("나이를 입력하세요");
		member.setAge(scanner.nextInt());

		return member;
	}

//	static Grade Sequence() {
//		
//	}

}
