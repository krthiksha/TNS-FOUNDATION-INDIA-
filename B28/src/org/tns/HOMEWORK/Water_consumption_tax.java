//water consumption tax policy 

package org.tns.HOMEWORK;
import java.util.Scanner;
public class Water_consumption_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int water_consumed = sc.nextInt();
		if(water_consumed == 45)
		{
			System.out.println("TAX : NO TAX");
		}
		else if(water_consumed>45 && water_consumed<75)
		{
			System.out.println("TAX : 475");
		}
		else if(water_consumed>75 && water_consumed<125)
		{
			System.out.println("TAX : 750");
		}
		else if(water_consumed>125 && water_consumed<200)
		{
			System.out.println("TAX : 1225");
		}
		else if(water_consumed>200 && water_consumed<350)
		{
			System.out.println("TAX : 1650");
		}
		else if(water_consumed>350)
		{
			System.out.println("TAX : 2000");
		}
	}

}
