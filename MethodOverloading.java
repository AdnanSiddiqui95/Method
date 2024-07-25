public class MethodOverloading

{
	public void add(int x,int y,int z)
	{
		System.out.println("The sum of int x,int y,int z :"+(x+y+z));
	}
	public void add(int x,int y)
	{
		System.out.println("The sum of int x,int y :"+(x+y));
	}
	public void add(double x,double y,double z)
	{
		System.out.println("The sum of double x,double y,double z :" +(x+y+z));
	}
	public void add(double x,double y)
	{
		System.out.println("The sum of double x,double y :" +(x+y));
	}
	public void add(int x,double y)
	{
		System.out.println("The sum of int x,double y :" +(x+y));
	}
	public void add(double x,int y)
	{
		System.out.println("The sum of double x,int y :" +(x+y));
	}
	
}
