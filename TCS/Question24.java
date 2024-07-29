package TCS;
import java.util.*;
//sum of table result
public class Question24 {
	
	private static int sumTable(int n) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum = sum + (n*i);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sumTable(n);
		System.out.println(result);
	}

}
