import java.util.*;
public class happy
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=0,sum=0,i=0,flag=0,a=1;
		int arr[] = new int[100];
		while(a==1)
		{
			sum=0;
			while(n>0)
			{
				r=n%10;
				sum=sum + (r*r);
				n=n/10;
			}
			System.out.println(sum);
			if(sum==1)
			{
				break;
			}
			for(int j=0;j<i;j++)
			{
				if(arr[j]==sum)
				{
					System.out.println("Number is not happy number");
					flag++;
					break;
				}
			}			
			if(flag==1)
			{
				break;		
			}
				arr[i++]=sum;
				n=sum;
				a=1;
		}
		if (flag==1)
		{

		}
		else
		{
			System.out.println("Number is Happy");
		}	
	}
}