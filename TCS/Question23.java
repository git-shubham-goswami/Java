package TCS;
// given an array and a integer k. we need to find the
// maximun element in each of the contiguos subarray
import java.util.*;
public class Question23 {
	
	private static int max(int[] arr, int s, int e) {
		int max = arr[0];
		for(int i=s; i<e; i++) {
			if(arr[s] > max) {
				max = arr[s];
			}
		}
		return max;
	}
	
	private static ArrayList<Integer> maxElement(int[] arr, int k) {
		int n = arr.length;
		ArrayList<Integer> rs = new ArrayList<>();
		
		for(int i=0; i<n-k+1; i++) {
			for(int j=i; j<i+k; j++) {
				rs.add(max(arr, i, i+k));
			}
		}
		
		return rs;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter value in arr: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter K: ");
		int k = sc.nextInt();
		
		ArrayList<Integer> rs = maxElement(arr, k);
		System.out.println(rs);
		
		
	}

}
