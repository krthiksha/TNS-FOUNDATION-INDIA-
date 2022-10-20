// to check the time and turn the light on or off

package org.tns.HOMEWORK;
import java.util.Scanner;
public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if(time >= 6 & time <= 11)
		{
			System.out.println("lights on");
		}
		else
		{
			System.out.println("lights off");
		}
	}

}
