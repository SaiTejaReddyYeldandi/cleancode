package com.cleancode;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.PrintStream;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double principalAmount,rateOfInterest;
		int periodInYears,num;
		PrintStream printstreamObject = new PrintStream(new FileOutputStream(FileDescriptor.out));
		SimpleAndCompoundInterest ob=new SimpleAndCompoundInterest();
		printstreamObject.println("1.Simple Interest\n2.Compound Interest");
		printstreamObject.println("Select any option:");
		int option = scanner.nextInt();
		switch(option) {
		case 1:printstreamObject.println("Input the principal amount to calculate simple interest");
				principalAmount=scanner.nextDouble();
				printstreamObject.println("Input the rate of interest :");
				rateOfInterest = scanner.nextDouble();
				printstreamObject.println("Input the time in years :");
				periodInYears = scanner.nextInt();
				printstreamObject.println("Calculated Simple Interest = " + ob.simpleInterest(principalAmount,rateOfInterest,periodInYears));
				break;
		case 2:printstreamObject.println("Input the principal amount to calculate compound interest");
			principalAmount=scanner.nextDouble();
			printstreamObject.println("Input the rate of interest :");
			rateOfInterest = scanner.nextDouble();
			printstreamObject.println("Input the time in years :");
			periodInYears = scanner.nextInt();
			printstreamObject.println("Input the number of times to compound :");
			num= scanner.nextInt();
			printstreamObject.println("Calculated Compound Interest = " + ob.compoundInterest(principalAmount,rateOfInterest,periodInYears,num));
			break;
		default:printstreamObject.println("Invalid input");
		
				
		}
		
	}

}
