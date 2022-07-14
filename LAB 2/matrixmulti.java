import java.util.*;
public class matrixmulti
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][2];
		int b[][]=new int[2][3];
		int c[][]=new int[3][3];

		System.out.println("enter first matrix : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("enter element : ");
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter second matrix : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("enter element : ");
				b[i][j]=sc.nextInt();
			}
		}

		System.out.println("multiplication of matrix : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<2;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}