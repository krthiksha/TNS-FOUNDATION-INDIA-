// to design program to calculate the fine for N days (book in library)

package org.tns.HOMEWORK;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		if(days<5 && days>1)
		{
			System.out.println("Rs 1 per day --->total Rs= "+days*1);
		}
		else if(days>5 && days<10)
		{
			System.out.println("Rs 5 per day --->total Rs= "+days*5);
		}
		else if(days>10)
		{
			System.out.println("Rs 10 per day --->total Rs= "+days*10);
		}
	}

}
