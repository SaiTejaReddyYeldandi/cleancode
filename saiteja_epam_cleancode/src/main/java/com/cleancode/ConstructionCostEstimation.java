package com.cleancode;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ConstructionCostEstimation {

public static void main(String[] args) {
	int area;
	PrintStream printstreamObject =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner scanner= new Scanner(System.in);
	CostEstimation ob=new CostEstimation();
	printstreamObject.println("Input the material standard:");
	printstreamObject.println("Select the material standard:");
	printstreamObject.println("1.Standard material\n2.Above standard material\n3.High standard material\n4.High standard material with fully automated home");
	printstreamObject.println("Select any option:");
	int option=scanner.nextInt();
	printstreamObject.println("Input the area of house : ");
	 area=scanner.nextInt();
	switch(option) {
	case 1:printstreamObject.println("Estimated cost for the construction "+area+" square feet is "+ob.constructionCost(area,1200)+"INR");
			break;
	case 2:printstreamObject.println("Estimated cost for the construction  "+area+" square feet is "+ob.constructionCost(area, 1500)+"INR");
			break;
	case 3:printstreamObject.println("Estimated cost for the construction  "+area+" square feet is "+ob.constructionCost(area, 1800)+"INR");
			break;
	case 4:printstreamObject.println("Estimated cost for the construction  "+area+" square feet is "+ob.constructionCost(area, 2500)+"INR");
			break;
	default :printstreamObject.println("Invalid material!");
			break;
		}
	}
}
