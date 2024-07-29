package Questions;
import java.util.*;
public class nQuees {
	
	public static void main(String[] args) {
		int n = 4;
	    boolean[][] board = new boolean[n][n];
	
	    
		System.out.println(nQueens(board,0));
		
	}
	
	static int nQueens(boolean[][] board, int row) {
		if(row == board.length) {
			display(board);
			return 1;
		}
		
		int count = 0;
		
		//placing the queen and check for every row and col
		for(int col = 0; col<board.length; col++) {
			if(isSafe(board, row, col)) {
				board[row][col] = true;
				count = count + nQueens(board, row+1);
				board[row][col] = false;
			}
		}
		
		return count;	
	}
	
	static boolean isSafe(boolean[][] board, int row, int col) {
		
		// CHECK VERTICAL UP
		for(int i=0; i<row; i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		// CHECK DIAGONAL LEFT
	
		for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(board[i][j]) {
				return false;
			}
		}
		
		// CHECK DIAGONAL RIGHT
		 
		for(int i=row, j=col; i>=0 && j<board.length; i--,j++) {
		    if(board[i][j]) {
			     return false; 
			  }
		  }
				
		return true;
		
	}  
	
	static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element) {
					System.out.print("Q");
				}else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
