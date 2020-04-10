package com.jse.grade;

public interface GradeService {
	public void add(Grade grade);
	public void setGrades(Grade[] grades);
	public void setCount(int count);
	public int getCount();
	public Grade[] getGrades();
	public int sum(Grade grade);
	public int avg(Grade grade);
	public String record(Grade grade);
	public String printGrades();
//	public String ranking();
	
}
