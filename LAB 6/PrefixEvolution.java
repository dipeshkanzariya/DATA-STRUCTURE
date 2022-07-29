import java.util.*;
public class PrefixEvolution
{
	static PostfixEvolution obj = new PostfixEvolution();
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the infix expression : ");
		String prefix = sc.next();
	
		System.out.println("The evoluted prefix is : "  );
		evolutionPrefix(prefix);
	}

	static int top=-1;
	int[] a = new int[100];

	public void push(int n)
	{
		if(top>=100)
		{
			System.out.println("Stack Overflow");
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
			System.out.println("Stack Underflow");
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

	static void evolutionPrefix(String prefix)
	{
		int l = prefix.length();

		for(int i=l-1;i>=0;i--)
		{
			if(isOperator(prefix.charAt(i)))
			{
				int op1 = obj.pop();
				int op2 = obj.pop();

				switch(prefix.charAt(i))
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
				int	operand = prefix.charAt(i) - '0';
				obj.push(operand);
			}
		}
		System.out.println(obj.pop());
	}
}