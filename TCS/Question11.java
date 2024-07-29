package TCS;
//find the number of even and odd integer in a  array
public class Question11 {
	
	private static void countEvenAndOdd(int[] arr) {
		int even = 0;
		int odd = 0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] % 2 == 0) {
				 even++;
			 }else {
				 odd++;
			 }
		 }
		 
		 System.out.println("Even number:" +even+ " " +"odd number:"+ odd);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,21,30,31,40,41};
		countEvenAndOdd(arr);
	}

}
