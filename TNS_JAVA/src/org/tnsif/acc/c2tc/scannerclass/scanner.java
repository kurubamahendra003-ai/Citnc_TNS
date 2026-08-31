package org.tnsif.acc.c2tc.scannerclass;
import java.util.Scanner;
public class scanner {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the name");
		String name = obj.nextLine();
		System.out.println("name:"+name);
		char c =name.charAt(3);
		System.out.println(c);
		
	}

}
