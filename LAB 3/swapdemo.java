import java.util.*;
class swap
{
	void swapnumber(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
public class swapdemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first no : ");
		int a=sc.nextInt();
		System.out.print("enter second no : ");
		int b=sc.nextInt();
		swap s=new swap();
		s.swapnumber(a,b);
	}
}