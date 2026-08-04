package org.tnisf.acc.c2tc.oops;

class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +"Age "+age);	 
	}	
}
public class ConstructorOverloading  {

	public static void main(String[] args) {
		Student st=new Student();
		Student st1=new Student("shiva");
		Student st2=new Student("vardhan", 99);
		
		
		

	}

}

