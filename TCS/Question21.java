package TCS;

import java.util.Scanner;

//find sum of cubes all number in the range of n to m
public class Question21 {
	
	private static int sumOfCubes(int n, int m) {
		int sum=0;
		
		for(int i=n; i<=m; i++) {
			sum += Math.pow(i, 3);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int result = sumOfCubes(n,m);
		System.out.println(result);
	}

}
