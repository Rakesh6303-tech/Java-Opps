package oops;

import java.util.Scanner;
public class Calculator1{
	public static void main(String args [])
	{
		Calculator111 c1 = new Calculator111();
		Calculator222 c2 = new Calculator222();
		Calculator333 c3 = new Calculator333();
		
		c1.add();
		c1.sub();
		c2.add();
		c2.sub();
		c3.add();
		c3.sub();
	}
interface Calculator0 {
	void add();
	void sub();
}
class Calculator111 implements Calculator0
{
	@Override
	public void add()
	{
		int a = 10;
		int b=20;
		System.out.println(a+b);
	}
	@Override
	public void sub()
	{
		int a = 10;
		int b=20;
		System.out.println(a+b);
	}
}
class Calculator222 implements Calculator0
{

	@Override
	public void add() {
		System.out.println("Enter the 1st Number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the 2st Number");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		System.out.println("Enter the 1st Number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the 2st Number");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		System.out.println(a-b);
	}	
}
class Calculator333 implements Calculator0
{

	@Override
	public void add() {
		System.out.println("Enter the 1st Number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the 2st Number");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(a+b);
		}

	}

	@Override
	public void sub() {
		System.out.println("Enter the 1st Number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the 2st Number");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(a-b);
		}
		
	}
}

	}

	

	
