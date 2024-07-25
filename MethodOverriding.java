public class MethodOverriding 
{
	private int num1;
	private int num2;
	public MethodOverriding(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int add()
	{
		int sum=num1+num2;
		return sum;
	}
}
