package com.linecomparisoncomputation;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		//Distance between two points for line1
		System.out.println("Enter the value of x1: ");
		double x1=s.nextDouble();
		System.out.println("Enter the value of y1: ");
		double y1=s.nextDouble();
		System.out.println("Enter the value of x2: ");
		double x2=s.nextDouble();
		System.out.println("Enter the value of y2: ");
		double y2=s.nextDouble();
		double dist1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		
		//Distance between two points for line2
		System.out.println("Enter the value of x3: ");
		double x3=s.nextDouble();
		System.out.println("Enter the value of y3: ");
		double y3=s.nextDouble();
		System.out.println("Enter the value of x4: ");
		double x4=s.nextDouble();
		System.out.println("Enter the value of y4: ");
		double y4=s.nextDouble();
		double dist2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		
		if (Double.compare(dist1, dist2) > 0) 
		      System.out.println("The length dist1 is greater than length dist2");
		   
		else if (Double.compare(dist1, dist2) < 0) 
		     System.out.println("The length dist1 is less than length dist2");
		   
		else 
		     System.out.println("The length dist1 is equal to length dist2");
		
		
	}

}
