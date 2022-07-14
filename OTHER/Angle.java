import java.util.*;
public class Angle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of hours");
		int h= sc.nextInt();
		System.out.println("Enter number of minutes");
		int m= sc.nextInt();

		if(h>=12)
		{
			h=h-12;
		}
		if(m==60)
		{
			m=0;
			h++;
		}

		double hourangle= h*30 + m/2;
		double minangle= m*6;

		double angle = Math.abs(hourangle - minangle);

		System.out.println("Angle between two hands of clock is " + angle);
	}
}