package com.linecomparisoncomputation;

public class LineComparisonComputation
{
	// create function for equal()
		public static void equal() 
		{
			// member Variables
			int x1, x2, y1, y2, x3, y3; // line coordinates
			int line1, line2;
			x1 = 1; // initialize value
			y1 = 1;
			x2 = 0;
			y2 = 5;
			x3 = 9;
			y3 = 0;

			// calculate length of a line
			line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			line2 = (int) Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
			// cover the double into string and store the value length1
			String s2 = String.valueOf(line2);
			String s1 = String.valueOf(line1);

			// checking lines are equal or not
			System.out.println(s1.equals(s2));
		}

		//// create function for CompareTo()
		public static void compare()
		{

			// member Variables
			int x1, x2, y1, y2, x3, y3;
			int line1, line2;
			x1 = 1;// initialize value
			y1 = 2;
			x2 = 3;
			y2 = 4;
			x3 = 8;
			y3 = 0;
			// calculate of length of line
			line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			line2 = (int) Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

			// print line 1 and line 2 value
			System.out.println("Line1  Length = " + line1);
			System.out.println("Line2  Length = " + line2);

			// creating a object of integer class
			Integer a = new Integer(line1);
			Integer b = new Integer(line2);

			// comparing the lines length using compareTo() method
			int compare = a.compareTo(b);

			// checking lines are equal,greater or smaller than one another
			if (compare > 0)
			{
				System.out.println("line1 is greater than line");
			} 
			else if (compare < 0) 
			{
				System.out.println("line1 is less than line2");
			} 
			else
			{
				System.out.println("line1 is equal to line2");
			}
		}

		public static void main(String[] args)
		{
			// function calling
			compare();
			equal();

		}

	}
