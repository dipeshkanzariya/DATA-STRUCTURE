import java.util.*;
class student_details
{
	int enrollment_no;
	String name;
	int sem;
	double cpi;

	student_details(int enrollment_no,String name,int sem,double cpi)
	{
		this.enrollment_no=enrollment_no;
		this.name=name;
		this.sem=sem;
		this.cpi=cpi;
	}
	void display()
	{
		System.out.println("Enrollment no : "+enrollment_no);
		System.out.println("Student name : "+name);
		System.out.println("Semester : "+sem);
		System.out.println("CPI : "+cpi);
	}
}
public class student
{
	public static void main(String[] args)
	{
		student_details obj[]=new student_details[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the details of student "+(i+1)+" : ");
			System.out.print("Enter Enrollment no : ");
			int enrollment_no=sc.nextInt();
			System.out.print("Enter Name : ");
			String name=sc.next();
			System.out.print("Enter Sememster : ");
			int sem=sc.nextInt();
			System.out.print("Enter CPI : ");
			double cpi=sc.nextDouble();
			obj[i]=new student_details(enrollment_no,name,sem,cpi);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("------ Details of Student "+(i+1)+" ------");
			obj[i].display();
		}
	}
}