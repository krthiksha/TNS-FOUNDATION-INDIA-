// to check if number is multiple of 3 or not 

package org.tns.HOMEWORK;
import java.util.Scanner;
	public class Multiple_of_3 {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if(number%3 == 0)
			{
				System.out.println("The number "
						+ ""+ number +" is multiple of 3");
				
			}
			System.out.println("The number is checked");
		}
	}
