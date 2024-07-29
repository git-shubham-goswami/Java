package TCS;
//unique paths
public class Question20 {
	
	private static int uniquePath(int n, int m) {
		
		if(n==0 && m==0) {
			return 1;
		}
		if(n<0 || m<0) {
			return 0;
		}

		int up = uniquePath(n-1, m);
		int left = uniquePath(n, m-1);
		
		return up + left;
		
	}
	
	public static void main(String[] args) {
		int result = uniquePath(2,6);
		System.out.println(result);
	}

}
