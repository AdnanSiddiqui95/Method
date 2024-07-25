public class MethodOverridingPlus extends MethodOverriding
{
	private int num3;
	public MethodOverridingPlus(int num1,int num2,int num3)
	{
		super(num1,num2);
		this.num3=num3;
	}
	public int add()
	{
		int sum=super.add();
		sum=sum+num3;
		return sum;
	}
}
