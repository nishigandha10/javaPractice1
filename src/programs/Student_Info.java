package programs;

//To Print student rollno and name...

public class Student_Info {
	
	
	int rno;
	String name;
	
	
	public Student_Info(int i, String nm) {
		// TODO Auto-generated constructor stub
		rno=i;
		name=nm;
	}


	public static void main(String[]agrs)
	{
		/*int rollno=1;
		String name="Swayam";
		System.out.println(rollno);
		System.out.println(name);*/
		
		Student_Info stud=new Student_Info(1, "Sonali");
		System.out.println(stud.rno);
		System.out.println(stud.name);
		
		
		
		
	}

}
