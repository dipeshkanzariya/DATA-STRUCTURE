import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
		System.out.print("enter the number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("given number is non prime");
		}
		else
		{
			System.out.println("given number is prime");
		}
	}
}