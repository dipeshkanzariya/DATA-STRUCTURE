public class secondlargest
{
	public static void main(String[] args)
	{
		int a[]={1,5,3,4,8,6,7,9};
		int max=a[0],smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				smax=max;
				max=a[i];
			}
			else if(smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println("second max is : "+smax);
	}
}