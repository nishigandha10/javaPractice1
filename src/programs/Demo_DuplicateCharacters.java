package programs;

// without using array...

public class Demo_DuplicateCharacters {
	
	public static void main(String[] args) {
		 String str="selenium";
	      String temp="";
	 
	      for (int i = 0; i < str.length(); i++) {
	         if(temp.indexOf(str.charAt(i)) == -1 ){
	             temp = temp + str.charAt(i);
	         }
	      }
	 
	      System.out.println(temp);
	      System.out.println("Unique character count: " + temp.length());
	 
	  }

}
