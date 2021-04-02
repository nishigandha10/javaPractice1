package programs;

public class Demo_Overriding {
	
	public void  add(int a,int b) {
		
	   int	c=a+b;
	   
	   System.out.println("Addition of two no :"+c);
	}
	
	public static class Addition
	{
		public void add(int a,int b)
		{
			int c=a+b;
			
			System.out.println(c);
		}
	
	

	public static void main(String[] args) 
	{
   
	  Addition a= new Addition();
	   a.add(10, 20);
		
			   
	}

}
}

