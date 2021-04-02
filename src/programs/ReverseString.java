package programs;

import java.util.Scanner;

public class ReverseString {
	private static Scanner sc;

	public static void main(String []args)
	{
		String original;
		String reverse= " ";
		
		System.out.println("Enter the string");
		sc = new Scanner(System.in);
		original=sc.nextLine();
		int length=original.length();
		System.out.println("length of string = ");
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
			
			System.out.println(reverse);
		}
		
	}

}
