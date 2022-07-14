import java.util.*;
public class stk
{
    int[] arr=new int[100];
    int top=-1;
    Scanner s = new Scanner(System.in);
    int n,i;

    public void push(int n)
    {
        System.out.println("================ PUSH ================");
        if (top>=100) 
        {
            System.out.println("Stack is over flow");    
        }
        else
        {
            top++;
            arr[top]=n;
        }
    }

    public int pop()
    {
        System.out.println("================ POP ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
        return arr[top--];
    }

    public int peep()
    {
        // int temp;
        // temp=arr[top];
        System.out.println("================ PEEP ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
        return arr[top];
    }

    public void change()
    {
        if(top==-1)
        {
            System.out.println("Stack is null");
        }
        else
        {

            System.out.print("Enter index and new eliment : ");
            i = s.nextInt();
            n = s.nextInt();
            System.out.println("================ CHANGE ================");
            arr[i]=n;
        }
    }
    
    public void display()
    {
        System.out.println("================ DISPLAY ================");
        for (int i =0;i<=top;i++) 
        {
            System.out.println(arr[i]);
        }
    }
}