package org.tnisf.acc.c2tc.scannerclass;
import java.util.Scanner;
public class ScannerScan {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name=obj.nextLine();
		
		
		
		System.out.println("enter your age");
		int age = obj.nextInt();
		
		System.out.println("enter your height");
		float height = obj.nextFloat();
		
		System.out.println("enter your hobby");
		String hobby = obj.nextLine();
		
		
	}
	

}
