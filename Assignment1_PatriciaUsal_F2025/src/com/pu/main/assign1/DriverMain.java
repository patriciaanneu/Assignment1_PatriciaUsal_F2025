package com.pu.main.assign1;

/**
 * @author Patricia Usal
 * @since 2025-09-10
 */

import com.pu.grades.assign1.GradeCalculation;
import com.pu.conversion.assign1.ConvertMilesToKilometers;
import com.pu.conversion.assign1.ConvertLitersToGallons;
import com.pu.currency.assign1.CurrencyConversion;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		
		GradeCalculation gradeCalculation = new GradeCalculation();
		ConvertMilesToKilometers milesToKm = new ConvertMilesToKilometers();
		ConvertLitersToGallons litersToGallons = new ConvertLitersToGallons();
		CurrencyConversion currencyConversion = new CurrencyConversion();
		
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\n Choose a task to perform:");
			System.out.println("1. Grade Calculator");
			System.out.println("2. Miles to Kilometer");
			System.out.println("3. Liters to Gallons");
			System.out.println("4. CAD to USD Conversion");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice: ");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1:
					gradeCalculation.calculateCourseGrade(scanner);
					break;
				case 2:
					System.out.print("Enter distance in miles:");
					double miles  = scanner.nextDouble();
					System.out.println(miles + " miles = " + milesToKm.convertMilestoKm(miles) + " kilometers");
					break;
				case 3:
					System.out.println("Enter volume in liters: ");
					double liters = scanner.nextDouble();
					System.out.println(liters + " liters = " + litersToGallons.convertLiterstoGallons(liters) + " gallons");
					break;
				case 4:
					System.out.print("Enter amount in CAD: ");
					double cad = scanner.nextDouble();
					System.out.println(cad + " CAD = " + currencyConversion.currenyConversion(cad) + " UDS");
					break;
				case 5:
					System.out.println("Exiting the Program");
					break;
				default:
					System.out.println("Invalid choice");
			}
			
			} while (choice != 5);
		
		scanner.close();
		
	}

}
