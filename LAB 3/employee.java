import java.util.*;
class employee_details
{
	int emp_id;
	String name;
	String designation;
	int salary;
	employee_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter employee id : ");
		emp_id=sc.nextInt();
		System.out.print("enter the name : ");
		name=sc.next();
		System.out.print("enter designation : ");
		designation=sc.next();
		System.out.print("enter salary : ");
		salary=sc.nextInt();		
	}
	void display()
	{
		System.out.println("employee id : "+emp_id);
		System.out.println("name of employee : "+name);
		System.out.println("designation : "+designation);
		System.out.println("salary : "+salary);
	}
}
public class employee
{
	public static void main(String[] args)
	{
		employee_details e=new employee_details();
		e.display();
	}
}