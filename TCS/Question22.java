package TCS;
import java.util.*;
public class Question22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int maxcost =0;
		String maxCostItem="";
		double totalPrice = 0;
		double avg = 0;
		
		for(int i=0; i<n; i++) {
			String item = sc.next();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			totalPrice = totalPrice + (price * quantity);
			if(totalPrice > maxcost) {
				maxCostItem = item;
			}	
			avg = totalPrice / (i+1);
			
		}
		
		System.out.printf("Task 1 - Item: %s\nTotal price: %.2f\nAverage Price: %.2f\n", maxCostItem, totalPrice, avg);

		
	}

}
