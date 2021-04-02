package programs;

public class Demo_Fibonacci {

	public static void main(String[] args) {

	
		/* //input to print Fibonacci series upto how many numbers 
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		//printing Fibonacci series upto number 
		for(int i=1; i<=number; i++)
		{ System.out.print(fibonacci2(i) +" ");
		} 
		}

	private static String fibonacci2(int i) {
		// TODO Auto-generated method stub
		return null ;*/
		
		int n = 100, t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}

			

}
