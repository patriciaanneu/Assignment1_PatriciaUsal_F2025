package com.pu.grades.assign1;

import java.util.Scanner;

public class GradeCalculation {
	
	public void calculateCourseGrade() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the course name: ");
		String courseName = scanner.nextLine();
		
		System.out.print("Enter the number of assessments in" + courseName + ": ");
		int numAssessments = scanner.nextInt();
		
		double finalScore = 0.0;
		double totalWeight = 0.0;
		
		for (int i = 1; i <= numAssessments; i++) {
			scanner.nextLine();
			
			System.out.print("Enter the name of assessment " + i + ": ");
			String assessmentName = scanner.nextLine();
			
			System.out.print("Enter the weight of " + assessmentName + ": ");
			double weight = scanner.nextDouble();
			
			System.out.print("Enter your score in " + assessmentName + ": ");
			double score = scanner.nextDouble();
			
			finalScore += (score * weight / 100.0);
			totalWeight += weight;
		}
		
		if (Math.abs(totalWeight - 100.0) > 0.01) {
			System.out.print("Warning: Total weight do not equal to 100%");
		}
		
		String grade = letterGrade(finalScore);
		
		System.out.println("\n--- Final Grade Report ---");
		System.out.println("Course: " +courseName);
		System.out.println("Final Grade: " + finalScore);
		System.out.println("Letter Grade: " + grade);
		
		private String letterGrade(double score) {
			if (score >= 90) return "A";
			else if (score >= 80) return "B";
			else if (score >= 70) return "C";
			else if (score >= 60) return "D";
			else return "F";
		}
}
