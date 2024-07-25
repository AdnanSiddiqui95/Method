public class OverloadingMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Printing the Method overloading for achieving Static Polymorphism also know as Compile time Polymorphism");
		MethodOverloading obj=new MethodOverloading();
		obj.add(10, 11);
		obj.add(10, 11, 12);
		obj.add(20.5, 21.3);
		obj.add(20.7, 21.9, 22.2);
		obj.add(10., 22.5);
		obj.add(22.5, 12);
	}

}
