package programs;

public class String_Comparision {
	
	public static void main(String args[])
	{
		String s1="Sonali";
		String s2="sonali";
		String s3="WELCOME";
		
		System.out.println(s1.equalsIgnoreCase(s2));  // Output = True
		System.out.println(s1.equals(s2));  //Output= false;
		System.out.println(s1.charAt(0)); // output = S
		System.out.println(s1.length());  //output= 6
		System.out.println(s1.concat(s3)); // output = SonaliWELCOME
		System.out.println(s1.contentEquals(s3)); // output = false
		System.out.println(s1.isEmpty()); //output = false
		System.out.println(s1.endsWith(s2)); // output = false
		System.out.println(s3.toLowerCase());// welcome
		System.out.println(s1);
		System.out.println(s1.intern());
		System.out.println(s1==s2); //False
	}

}
