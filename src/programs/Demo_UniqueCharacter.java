package programs;

public class Demo_UniqueCharacter {

	public static void main(String[] args) {
		
		char[]c = {'a','b','b'};
		 
        for (int i = 0; i < c.length; i++)
        {
           // for (int j = i+1; j < c.length; j++)
        	for(int j=0;j<i;j++)
            {
              if ((c[i] == c[j]) && (i != j))
            	
            	// if (c[i] != c[j]) 
                 	
            	
                {
                    System.out.println("Duplicate characters are : "+c[j]);
                }
            }
        }

	}

}
