import java.util.Scanner;

public class stkdemo 
{
    public static void main(String[] args)
    {
        stk st = new stk();
        Scanner s = new Scanner(System.in);

        while (true)
        {
            System.out.println();
            System.out.println("Enter what you want to do :");
            System.out.println("Press 1 For PUSH      : ");
            System.out.println("Press 2 For POP       : ");
            System.out.println("Press 3 For PEEP      : ");
            System.out.println("Press 4 For CHANGE    : ");
            System.out.println("Press 5 For DISPLAY   : ");
            System.out.println("Press 6 For QUIT      : ");
            int opration = s.nextInt();
            int n, i;
            switch (opration)
            {
                case 1:
                    System.out.print("Enter eliment to add : ");
                    n = s.nextInt();
                    st.push(n);
                    break;
                case 2:
                    System.out.println(st.pop());
                    break;
                case 3:
                    System.out.println(st.peep());
                    break;
                case 4:
                    st.change();
                    break;
                case 5:
                    System.out.println();
                    st.display();
                    break;
                default:
                    System.out.println("Plese Enter A valid opration ! ");
                    break;
            }
            if(opration==6)
            {
                break;
            }
        } 
    }
}
