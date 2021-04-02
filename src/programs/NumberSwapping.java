package programs;

import java.util.Scanner;

public class NumberSwapping {
	
	private static Scanner sc;

	public static void main(String []args)
	{
		/*int a=20;
		int b=10;
		
		System.out.println("Before swapping a= "+a );
		System.out.println("Before swapping b= "+b );
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a= "+a);
		System.out.println("After Swapping b= "+b);*/
		
		
		
		//Another way......
		
		  int x, y;
	      System.out.println("Enter x and y");
	      sc = new Scanner(System.in);
	     
	      x = sc.nextInt();
	      y = sc.nextInt();
	      
	      System.out.println("Before swapping x= "+x);
	      System.out.println("Before swapping y= "+y);
	      
	      x=x+y;
	      y=x-y;
	      x=x-y;
	      
	      System.out.println("After swapping x= "+x);
	      System.out.println("After swapping y= "+y);
	      

				
	}

}
