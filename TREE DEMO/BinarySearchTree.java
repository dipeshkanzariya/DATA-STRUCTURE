import java.util.*;
class BST{
	Node root;
	class Node{
		int data;
		Node left,right;

		Node(int n){
			data = n;
			left = null;
			right = null;
		}


	}
	public void insert(int n){
		Node nnode = new Node(n);
		if (root == null){
			root = nnode;
		}

		else{
			Node temp = root;
			while(temp.left != null || temp.right != null){

				if(nnode.data >= temp.data && temp.right != null){
					temp = temp.right;
				}

				else if(nnode.data <= temp.data && temp.left != null){
					temp = temp.left;
				}

				else{
					break;
				}
			}

			if(nnode.data >= temp.data){
				temp.right = nnode;
			}

			else{
				temp.left = nnode;
			}
		}
	}

	public void displayInOrder(){

		if(root == null){
			System.out.println("Binary Tree is empty..!");

		}

		else{
			Node temp = root;
			Stack<Node> st = new Stack<Node>();

			while(temp != null || st.size()>0){

				while(temp != null){
					st.push(temp);
					temp = temp.left;
				}

				temp = st.pop();
				System.out.println(temp.data);
				temp = temp.right;
			}
		}
	}

	public void displayPreOrder(){
		Stack<Node> st = new Stack<Node>();

		st.push(root);

		while(st.size()>0){

			Node temp = st.pop();
			System.out.println(temp.data);

			if(temp.right != null){
				st.push(temp.right);
			}

			if(temp.left != null){
				st.push(temp.left);
			}
		}
	}

	public void displayPostOrder(){
		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();

		st1.push(root);

		while(st1.size() > 0){
			Node temp = st1.pop();
			st2.push(temp);

			if(temp.left != null){
				st1.push(temp.left);
			}

			if(temp.right != null){
				st1.push(temp.right);
			}
		}

		while(st2.size() > 0){

			Node temp2 = st2.pop();
			System.out.println(temp2.data);
		}

	}


	public void deleteNode(int n){
		Node parent = null;
		Node temp = root;

		while(temp != null && temp.data != n){
			parent = temp;

			if(n > temp.data){
				temp = temp.right;
			}

			else{
				temp = temp.left;
			}
		} 
		
		// Delete Leaf Node

		if(temp.left == null && temp.right == null){
			if(parent.data > temp.data){
				parent.left = null;
			}

			else{
				parent.right = null;
			}
		}

		// Delete Node with one child.

		if(temp.left != null && temp.right == null){
			if(temp.data > parent.data){
				parent.right = temp.left;
			}

			else{
				parent.left = temp.left;
			}
		}

		if(temp.left == null && temp.right != null){
			if(temp.data > parent.data){
				parent.right = temp.right;
			}

			else{
				parent.left = temp.right;
			}
		}

		// Delete Node with two child.

		if(temp.left != null && temp.right != null){
			Node t = inorderSuccessor(temp);
			temp.data = t.data;
		}
	}

	public Node inorderSuccessor(Node N){
		boolean rightchild = true;
		Node parent = N;
		N = N.right;

		if(N.left != null){
			rightchild = false;
		}

		while(N.left != null){
			parent = N;
			N = N.left;
		}

		if(rightchild){
			parent.right = N.right;
		}

		else{
			parent.left = N.right;
		}

		return N;	
	}
}
public class BinarySearchTree{
	public static void main(String args[]){
		BST b = new BST();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Enter choice :");
			System.out.println("1 : Insert");
			System.out.println("2 : Display In-order");
			System.out.println("3 : Display Pre-order");
			System.out.println("4 : Display Post-order");
			System.out.println("5 : Delete Node");
			System.out.println("6 : Quit");

			int op = sc.nextInt();

			switch(op){
			case 1 :
				System.out.print("Enter no : ");
				b.insert(sc.nextInt());
				break;

			case 2 :
				System.out.println("In-order of given tree :");
				b.displayInOrder();
				break;

			case 3 :
				System.out.println("Pre-order of given tree :");
				b.displayPreOrder();
				break;

			case 4 :
				System.out.println("Post-order of given tree :");
				b.displayPostOrder();
				break;

			case 5 :
				System.out.print("Enter Number to be deleted : ");
				b.deleteNode(sc.nextInt());
				break;

			case 6: 
				System.out.println("Thank you..!");
				System.exit(0);
				break;

			default :
				System.out.println("Enter valid choice");
			}
		}
	}
}
