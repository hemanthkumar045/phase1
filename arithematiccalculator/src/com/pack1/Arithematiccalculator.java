
package com.pack1;

import java.util.Scanner;

public class Arithematiccalculator
{
	
	static int add(int x,int y)
	{
		return x+y;
	}
	static int sub(int x,int y)
	{
		return x-y;
	}
	static int mul(int x,int y)
	{
		return x*y;
	}
	static int div(int x,int y)
	{
		return x/y;
	}
	static int moduloDivsion(int x,int y)
	{
		return x%y;
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("goos morning ");
		System.out.println("enter your choice 1 for add,2 for sub,3 for mul,4 for div,5 for modulodiv");
		int choice=input.nextInt();
		if(choice==1)
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+add(a,b));
		}
		if(choice==1)
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+add(a,b));
		}
		else if(choice==2)
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+sub(a,b));
		}
		else if(choice==3)
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+mul(a,b));
		}
		else if(choice==4)
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+div(a,b));
		}
		else 
		{
			System.out.println("Enter a first number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			System.out.println("Answer is ="+moduloDivsion(a,b));
		}
		System.out.println(" ");
		System.out.println("thank you");
	}
}
