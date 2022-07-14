import java.util.Scanner;
class fact
{
	int fact(int x)
	{
		if(x==1)
		{
			return 1;
		}
		else
		{
			return x*fact(x-1);
		}
	}
}
public class factorial1
{
	public static void main(String[] args)
	{
		System.out.print("enter the number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		fact f1=new fact();
		int b=f1.fact(a);
		System.out.println("factorial = "+b);
	}
}