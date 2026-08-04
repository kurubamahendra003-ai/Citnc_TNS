package org.tnisf.acc.c2tc.oops;

public class Addition {
	double abc(double a,double b) {
		System.out.println(a+b);
		return a+b;
	}
	int abc(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	int add(int a,int b,int c) {
		System.out.println(a+b+c);
		
		return a+b+c;
	}
	double add(double a,double b,double c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	
    public class main{
	public static void main(String[] args) {
		Addition add=new Addition();
		System.out.println("two integer sum "+add.abc(1,3));
		System.out.println("three integer sum "+add.abc(1,3,4));
		System.out.println("two double sum "+add.ab(1,3));
		System.out.println("three double sum "+add.add(1,3,4));
		
		
	}
		

	}

}
