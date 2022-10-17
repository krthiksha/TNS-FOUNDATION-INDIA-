package org.tns.HOMEWORK;
import java.util.Scanner;
public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		int subject_1_mark = sc.nextInt();
		int subject_2_mark = sc.nextInt();
		int subject_3_mark = sc.nextInt();
		int average =  (subject_1_mark + subject_2_mark +subject_3_mark )/3;
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("subject_1_mark = "+subject_1_mark);
		System.out.println("subject_2_mark = "+subject_2_mark);
		System.out.println("subject_3_mark = "+subject_3_mark);
		System.out.println("average = "+average);
		
	}

}
