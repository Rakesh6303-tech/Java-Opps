package oops;
/*
 * Exception Handling are classified into two types 
 * 1) checked Exception (During Compliation)
 * 2) unchecked Exception (During RunTime) 
 * Below example i want to print A,B,C,D by using seconds one after one will be printing
 * Below is Example for Checked Exception
 * --> try block--> Which is used to Generate  Exception in the try block
 * --> catch block--> will catch the exception from the try block
 */
import java.util.*;
public class Exception1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=65;i<=69;i++) // A to E
		{
			if(i%2==0)
			{
				System.out.println((char)i); // condition
			}
			System.out.println((char)i);
//           Thread.sleep(3000);             Checked Exception During Compilation 
			try {               // to avoid CE we use try & catch 
				Thread.sleep(3000);  // Sleep is a method This is Seconds Every 3 seconds after letter will be printed
			}
			catch(Exception e)  // catch the exception if occur in the try
			{
				System.out.println("Some Problem Occured");
			}
		}
		}
}
