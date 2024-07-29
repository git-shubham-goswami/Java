package Questions;
import java.util.*;

public class nKnight {
	public static void main(String[] args) {
        int n = 4;		
		boolean[][] board = new boolean[n][n];
		nKnights(board,0,0,4);
		
	}
	
	static void nKnights(boolean[][] board, int row, int col, int k) {
		//k = knight
		if(k == 0) {
			display(board);
			System.out.println();
			return;
		}
		
		if(row==board.length-1 && col == board.length) {
			return;
		}
		
		if(col==board.length) {
			nKnights(board,row+1,0,k);
			return;
		}
		
		if(isSafe(board,row,col)) {
			board[row][col] = true;
			nKnights(board, row, col+1, k-1);
			board[row][col] = false;
		}
		//just move ahead
		nKnights(board, row, col+1, k);
		
	}
	
	
	static boolean isSafe(boolean[][] board, int row, int col) {
		if(isValid(board,row-2,col-1)) {
			if(board[row-2][col-1]) {
				return false;
			}
			
		}
		
		if(isValid(board,row-1,col-2)) {
			if(board[row-1][col-2]) {
				return false;
			}
			
		}
		
		if(isValid(board, row-2, col+1)) {
			if(board[row-2][col+1]) {
				return false;
			}
			
		}
		
		if(isValid(board, row-1, col+2)) {
			if(board[row-1][col+2]) {
				return false;
			}
			
		}
		return true;
	}
	
	static boolean isValid(boolean[][] board, int row, int col) {
		if(row >= 0 && row < board.length && col >= 0 && col <board.length) {
			return true;
		}
		return false;
	}
	
	
	static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element) {
					System.out.print("K ");
				}else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}

}
