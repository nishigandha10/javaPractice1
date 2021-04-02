package programs;

public class Practice_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t1=0,t2=1,n=10;
		System.out.println(n);
		for(int i=1;i<=n;++i)
		{
			System.out.println(t1);
			int sum= t1+t2;
			t1=t2;
			t2=sum;
			
			
		}
		

	}

}
