import java.util.Scanner;
class DoLi{
	Node head;
	class Node{
		int data;
		Node next,prev;

		Node(int a){
			data = a;
			next = null;
			prev = null;
		}
	}

	public void insert(int n){
		Node nnode = new Node(n);

		if(head == null){
			head = nnode;
		}

		else{
			Node last = head;

			while(last.next != null){
				last = last.next;
			}
			last.next = nnode;
			nnode.prev = last;
		}
	}

	public void display(){
		Node last = head;
		while(last != null){
			System.out.println(last.data);
			last=last.next;
		}
	}
}

public class Doublylinklist{
	public static void main(String[] args){
		DoLi dl = new DoLi();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Enter Choice : ");
			System.out.println("1 : insert ");
			System.out.println("2 : display ");
			System.out.println("3 : Quit ");
			int op = sc.nextInt();

			switch(op){
				case 1 :
					System.out.print("Enter no. : ");
					dl.insert(sc.nextInt());
					break;

				case 2 :
					dl.display();
					break;

				case 3 :
					System.exit(0);
					break;

				default :
					System.out.println("Enter valid Choice...!! ");				
			}
		}
	}
}