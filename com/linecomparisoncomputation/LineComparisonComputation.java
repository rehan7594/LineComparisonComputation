package com.linecomparisoncomputation;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		double x1=s.nextDouble();
		System.out.println("Enter the value of y1: ");
		double y1=s.nextDouble();
		System.out.println("Enter the value of x2: ");
		double x2=s.nextDouble();
		System.out.println("Enter the value of y2: ");
		double y2=s.nextDouble();
		double dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance between two points: "+dist);
	}

}
