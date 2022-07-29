import java.util.*;
class queued
{
		int front=0,rear=-1;
		int arr[]=new int[100];

		public void enque(int n)
		{
			if(rear>=100)
			{
				System.out.println("Queue is full");
			}
			else
			{
				rear++;
				arr[rear]=n;
			}
		}

		public int deque()
		{
			if(rear<0)
			{
				System.out.println("Queue is empty");
			}
				return arr[front++];		
		}

		public void display()
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
}
public class queuedemo
{
	public static void main(String[] args)
	{
		queued Q=new queued();
		Scanner sc=new Scanner(System.in);
		int op;
		while(true)
		{
			System.out.println("Enter choice :");
			System.out.println("Enter 1 : Enque");
			System.out.println("Enter 2 : Deque");
			System.out.println("Enter 3 : display");
			System.out.println("Enter 4 : Quit");
			op=sc.nextInt();

			switch(op)
			{
				case 1 :
					System.out.println("Enter number : ");
					Q.enque(sc.nextInt());
					break;
				case 2 :
					System.out.println(Q.deque());
					break;
				case 3 :
					Q.display();
					break;
				default :
					System.out.println("Enter valid choice ! ");
			}
			if(op==4)
			{
				break;
			}
		}
	} 
}