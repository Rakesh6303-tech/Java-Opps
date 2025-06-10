package oops;

import java.util.Scanner;

public interface Calculator {
	void add();
	void sub();
}
class MyCalculator1 implements calculator
{
	@Override
	public void add()
	{
		int a = 200;
		int b = 100;
		System.out.println(a+b);
		
	}
	@Override
	public void sub()
	{
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}
}
class Mycalculator2 implements calculator
{
	@Override
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		System.out.println(m+n);
	}
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		System.out.println(m-n);
	}
}
class Mycalculator3 implements calculator
{
	@Override
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		if(m==0 || n==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(m+n);
		}
	}
	@Override
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int m = scan.nextInt();
		System.out.println("Enter the Second Number");
		int n = scan.nextInt();
		if(m==0 || n==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(m-n);
		
	}
}



	public static void main(String[] args) {
		MyCalculator1 c1 = new MyCalculator1();
		Mycalculator2 c2 = new Mycalculator2();
		Mycalculator3 c3 = new Mycalculator3();
		
		c1.add();
		c1.sub();
		
		c2.add();
		c2.sub();
		
		c3.add();
		c3.sub();
		
		
//		calculator c;
//		
		
	}
	}
