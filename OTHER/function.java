public class function
{
	public static void main(String[] args)
	{
		int count=1,a[]={0,0,0,2,1,1,1,1,2,2,2,2};
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]>a[i])
			{
				count=-1;
				break;
			}
			if(a[i-1]!=a[i])
			{
				if(count<3)
				{
					count=-1;
					break;
				}
				count=0;
			}
			count++;
		}
		if(count>=3)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}
}