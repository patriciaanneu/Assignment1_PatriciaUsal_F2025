package com.pu.grades.assign1;

public class GradeCalculation {

	public char calculateGrade(double averagePercentage) {
		if (averagePercentage >= 90)
			return 'A';
		else if (averagePercentage >= 80)
			return 'B';
		else if (averagePercentage >= 70)
			return 'C';
		else if (averagePercentage >= 60)
			return 'D';
		else return 'F';
	}
	
	public double calculateAverage(double [] percentages) {
		double sum = 0;
		for (double p: percentages) {
			sum += p;
		}
		return sum / percentages.length;
	}

}
