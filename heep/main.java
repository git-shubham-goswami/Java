package heep;
import java.util.*;
public class main {
	public static void main(String[] args) throws Exception {
		ImplHeep<Integer> heap = new ImplHeep<>();
		heap.insert(34);
		heap.insert(45);
		heap.insert(22);
		heap.insert(89);
		heap.insert(76);
		
		
		System.out.println(heap.remove());
		
		ArrayList list = heap.heapSort();
		System.out.println(list);
	}
	

}
