import java.util.*;
public class PostfixEvolution{
	static PostfixEvolution obj = new PostfixEvolution();
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the postfix expression : ");
		String postfix = sc.next();
	
		System.out.println("The evoluted postfix is : "  );
		evolutionPostfix(postfix);
	}

	static int top=-1;
	int[] a = new int[100];

	public void push(int n)
	{
		if(top>=100)
		{
			System.out.println("Overflow");
		}
		else
		{
			top++;
			a[top]=n;
		}
	}

	public int  pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
			return 0;
		}
		return a[top--];
	}

	static boolean isOperator(char ch)
	{
		if (ch=='+' || ch=='-' || ch=='*' || ch=='/')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	static void evolutionPostfix(String postfix)
	{
		int l = postfix.length();

		for(int i=0;i<l;i++)
		{
			if(isOperator(postfix.charAt(i)))
			{
				int op2= obj.pop();
				int op1 = obj.pop();

				switch(postfix.charAt(i))
				{
					case'+':	obj.push(op1+op2);
								break;

					case '-':	obj.push(op1-op2);
								break;

					case '*': 	obj.push(op1*op2);
								break;

					case '/': 	obj.push(op1/op2);
								break;
				}
			}
			else
			{
				int	operand = postfix.charAt(i) - '0';
				obj.push(operand);
			}
		}
		System.out.println(obj.pop());
	}
}