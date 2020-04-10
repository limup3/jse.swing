package com.jse.grade;

public class GradeServiceImpl implements GradeService{
	
	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {

		grades = new Grade[3];
		count = 0;
	}
	
	@Override
	public void setGrades( Grade[] grades) {
		this.grades = grades;
	}
	
	@Override
	public Grade[] getGrades() {
		
		return grades;
	}
	
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
		
	}

	@Override
	public void setCount(int count) {

		this.count = count;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public int sum(Grade grade) {
		return grade.getKor()+grade.getMath()+grade.getEng();
	}

	@Override
	public int avg(Grade grade) {
		return sum(grade)/3;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		
		int avg = avg(grade);
		
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

	@Override
	public String printGrades() {
		String result = "";
		Grade[] grades = getGrades();
		for (int i = 0; i < 3; i++) {

			result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]" +"\n",
					grades[i].getName(),
					sum(grades[i]),
					avg(grades[i]),
					record(grades[i]));
		}

		return result;
	}

	


	

}
