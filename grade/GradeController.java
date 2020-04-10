package com.jse.grade;



import javax.swing.JOptionPane;

import com.jse.member.Member;
import com.jse.util.Constants;
import com.sun.glass.ui.Pixels.Format;

public class GradeController {
	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"

	public static void main(String[] args) {
		
		
		
		GradeService gradeService = new GradeServiceImpl();
		Member[] members = new Member[3];
		Grade grade = null;
	
		while (true) {
			
			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			
			case "0" :
				
				return;
			case "1" :
//				
				
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKor(Integer.parseInt(values[1]));
					grade.setEng(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
					
					
					
//					grades[i] = input(scanner);
				}
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null, gradeService.printGrades());
				
				break;
			case "3":
//				if (grades[0].sum() > grades[1].sum() && grades[0].sum() > grades[2].sum()
//						&& grades[1].sum() > grades[2].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//				} else if (grades[1].sum() > grades[0].sum() && grades[1].sum() > grades[2].sum()
//						&& grades[2].sum() > grades[0].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//				} else if (grades[2].sum() > grades[0].sum() && grades[2].sum() > grades[1].sum()
//						&& grades[1].sum() > grades[0].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//				} else if (grades[0].sum() > grades[1].sum() && grades[0].sum() > grades[2].sum()
//						&& grades[2].sum() > grades[1].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//				} else if (grades[1].sum() > grades[0].sum() && grades[1].sum() > grades[2].sum()
//						&& grades[0].sum() > grades[2].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//				} else if (grades[2].sum() > grades[0].sum() && grades[2].sum() > grades[1].sum()
//						&& grades[0].sum() > grades[1].sum()) {
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[2].getName(), grades[2].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[0].getName(), grades[0].sum()));
//					System.out.println(String.format("%s : 총 %d 점 ,", grades[1].getName(), grades[1].sum()));
//				} else {
//					System.out.println("잘못입력하셧습니다.");
//				}

				break;

			}

		}
	}



	

}
