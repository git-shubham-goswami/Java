package Questions;

public class countZero {
	static int count = 0;
	public static int countZero(int n) {
		
		if(n%10 == 0) {
			count++;
		}
		if(n<=0) {
			return 0;
		}
		countZero(n/10);
		return count-1;
	}
	public static void main(String[] args) {
		 System.out.println(countZero(12000000));
	}

}
