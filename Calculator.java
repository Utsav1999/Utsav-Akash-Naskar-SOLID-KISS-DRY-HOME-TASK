import java.util.Scanner;
import java.io.*;

public class Calculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			double a,b,result=0;
			System.out.println("This is a simple calculator program.\n");
			System.out.println("Enter 1 to ADDITION\nEnter 2 for SUBTRACTION\nEnter 3 for MULTIPLICATION\nEnter 4 for DIVISION\nEnter 5 for EXIT\n\n"); //statements to run the calculator
			System.out.print("Enter your choice: "); //user will enter his/her choice
			int ch=sc.nextInt(); //choice input
			switch(ch)	//switch case conditions
			{
				case 1: //for addition
						System.out.print("\n\nEnter two numbers you want to add: ");
						a=sc.nextInt();
						b=sc.nextInt();
						add(a,b);
						break;
				case 2: //for subtraction
						System.out.print("\n\nEnter two numbers you want to subtract: ");
						a=sc.nextInt();
						b=sc.nextInt();
						subtract(a,b);	
						break;
				case 3: //for multiplication
						System.out.print("\n\nEnter two numbers to multiply: ");
						a=sc.nextInt();
						b=sc.nextInt();
						mult(a,b);
						break;
				case 4: //for division
						System.out.print("\n\nEnter two numbers where second number will divide first number: ");
						a=sc.nextInt();
						b=sc.nextInt();
						divide(a,b);
						break;
				case 5: System.exit(0);
				default: System.out.println("\nWrong Choice!\n");
			}
		}
	}
		
	public static void add(double a, double b) //method for addition
	{
		Scanner sc=new Scanner(System.in);
		double res=0;
		res=a+b;
		while(true)	//to add another number with the result
		{
			System.out.println("\n\nEnter 1 to add another number\nEnter 2 to Show Result\nEnter 3 to Exit");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("\n\nEnter the number you want to add with result: ");
						int i=sc.nextInt();
						add(res,i);
						break;
				case 2: show(res);
						break;
				case 3: main(null);
						System.exit(0);
				default: System.out.println("\nWrong Choice!");
			}
		}
		
	}
		
	public static void subtract(double a, double b)
	{
		Scanner sc=new Scanner(System.in);
		double res=0;
		res=a-b;
		while(true)	//to subtract another number from the result
		{
			System.out.println("\n\nEnter 1 to subtract another number\nEnter 2 to Show Result\nEnter 3 to Exit");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("\n\nEnter the number you want to subtract from result: ");
						int i=sc.nextInt();
						subtract(res,i);
						break;
				case 2: show(res);
						break;
				case 3: main(null);
						System.exit(0);
				default: System.out.println("\nWrong Choice!");
			}
		}
	}
		
	public static void mult(double a, double b)
	{
		Scanner sc=new Scanner(System.in);
		double res=0;
		res=a*b;
		while(true)	//to multiply another number with the result
		{
			System.out.println("\n\nEnter 1 to multiply another number\nEnter 2 to Show Result\nEnter 3 to Exit");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("\n\nEnter the number you want to multiply with result: ");
						int i=sc.nextInt();
						mult(res,i);
						break;
				case 2: show(res);
						break;
				case 3: main(null);
						System.exit(0);
				default: System.out.println("\nWrong Choice!");
			}
		}
	}
		
	public static void divide(double a, double b)
	{
		Scanner sc=new Scanner(System.in);
		double res=0;
		res=a/b;
		while(true)	//to divide the result by another number
		{
			System.out.println("\n\nEnter 1 to divide the result\nEnter 2 to Show Result\nEnter 3 to Exit");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("\n\nEnter the number that will divide the result: ");
						int i=sc.nextInt();
						divide(res,i);
						break;
				case 2: show(res);
						break;
				case 3: main(null);
						System.exit(0);
				default: System.out.println("\nWrong Choice!");
			}
		}
	}
		
	public static void show(double res)
	{
		System.out.println("\n\nThe Result: "+res);
	}
}