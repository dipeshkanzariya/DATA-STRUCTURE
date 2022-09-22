import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int s = sc.nextInt();
		int arr[] = new int[s];
		for(int i=0 ; i < s ; i++){
			System.out.print("Enter element "+ (i+1) +" : ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int start = 0;
		int end = s;
		int mid;

		System.out.print("Enter element to be checked : ");
		int n = sc.nextInt();

		while(start<=end){
			mid = (start+end)/2;

			if(n == arr[mid]){
				System.out.println("number is found at index "+ mid);
				break;
			}

			else if(n < arr[mid]){
				end = mid - 1;
			}

			else{
				start = mid + 1;
			}
		}
	}
}