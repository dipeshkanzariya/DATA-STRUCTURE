import java.util.Scanner;
public class factorial
{
	public static void main(String[] args)
	{
		System.out.print("enter number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("factorial of "+a+" is : "+b);
	}
}