package programs;
//Demo for abstraction....



abstract class Bike
{
	Bike() {
		
		System.out.println("I will always run first...");
	}
	abstract void run();
	void speed()
	{
		System.out.println("Speed of bike very fast");
	}
}
 class Demo_Abstraction extends Bike
 
{
	
	void run()
	{
		System.out.println("Bike runs fast");
	}
	
	
	public static void main(String[] args) {
	
	Bike b=new Demo_Abstraction();
	b.run();
	b.speed();

	}

}
