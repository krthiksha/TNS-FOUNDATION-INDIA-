// to print maximum of 3 numbers

package org.tns.HOMEWORK;
import java.util.Scanner;
	public class Maximum_of_3_numbers
	{	
		public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is maximum");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is maximum");
		}
		else
		{
			System.out.println("C is maximum");
		}
	}
	}	
