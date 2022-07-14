import java.util.*;
public class array
{
	public static void main(String[] args)
	{
		System.out.print("enter the number of elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the element of index " +i+ ": ");
			a[i]=sc.nextInt();
		}
		System.out.print("enter b : ");
 		int b=sc.nextInt();
 		System.out.print("enter c : ");
 		int c=sc.nextInt();
 		for(int i=0;i<n;i++)
 		{
 			if(b==a[i])
 			{
 				a[i]=c;
 				flag++;
 				System.out.println("updated index is : "+i);
 			}
 		}
 		if(flag!=0)
 		{	
 			System.out.println("Final array : ");
 			for(int i=0;i<n;i++)
 			{
 				System.out.println("the element of index " +i+" is : "+a[i]);
 			}
 		}
 		else
 		{
 			System.out.println("nothing is changed in array");
 		}
	}
}