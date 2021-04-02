package programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo_Reverse {
	
	public static void main(String args[])
	{
		
		String str="";
		System.out.println("Enter the string: ");
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			{
				str=br.readLine();
				char[] c=str.toCharArray();
				for(int i=c.length-1;i>=0;i--)
					System.out.println(c[i]);
				
			
			
		    } 
		}
			catch (Exception e) {
			// TODO: handle exception
		}
	}

}
