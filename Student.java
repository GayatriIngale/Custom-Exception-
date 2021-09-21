package CustomException;

import java.util.Scanner;

public class Student {
	public String attendenceOfStudent(int n) throws NotEligibleForExam {
		String s = "You are Eligible for Final Exam";
		     if(n<75) {
		    	 throw new NotEligibleForExam("Your attndence is less than 75");
		     }
		     
		    	 
		
		return s;
	
	}
	public static void main(String args[]) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your attendence: ");
		int n = sc.nextInt();
		try {
			System.out.println(s.attendenceOfStudent(n));
			
		}
		catch(NotEligibleForExam e) {
			e.printStackTrace();
		}
			
		}

}
