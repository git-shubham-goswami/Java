package Questions;
import java.util.*;
public class linearSearch {
	static ArrayList<Integer> list = new ArrayList<>();
	public static ArrayList<Integer> linearSearch(int[] arr, int target, int idx) {
	
		if(arr[idx] == target) {
			list.add(idx);
		}
         if(idx == arr.length-1) {
			return list;
		}
		return linearSearch(arr,target,idx+1);
	}
	public static void main(String[] args) {
		int arr[] = {3,2,18,18,18,6};
		int idx = 0;
		System.out.println(linearSearch(arr,18,idx));
	}

}
