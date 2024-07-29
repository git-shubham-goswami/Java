package Questions;

public class maze {
	public static void main(String[] args) {
		int ans = findPath(3,3);
		System.out.println(ans);
		//printPath("",3,3);
		//diagnollyPath("",3,3);
		Boolean[][] maze = {{true,true,true},
				            {true,false,true},
				            {true,true,true}
				            };
		
		
		pathWithObstical("",maze,0,0);
	} 
	
	public static int findPath(int row, int col) {
		if(row == 1 || col == 1) {
			return 1;
		}
		int left = findPath(row - 1 , col);
		int right = findPath(row , col - 1);
		return left + right;
	}
	
	//print path
	
	public static void printPath(String p, int r, int c) {
		if(r==1 && c==1) {
			System.out.println(p);
		}
		
		if(r>1) {
			printPath(p+'D', r-1, c);	
		}
		if(c>1) {
			printPath(p+'R', r, c-1);
		}
	}
	
	//with daigonal path
	
	public static void diagnollyPath(String p, int row, int col) {
		if(row==1 && col==1) {
			System.out.println(p);
			return;
		}
		
		if(row>1) {
			diagnollyPath(p+'W', row-1, col);
		}
		if(col>1) {
			diagnollyPath(p+'R', row, col-1);
		}
		if(row>1 && col>1) {
			diagnollyPath(p+'D', row-1, col-1);
		}
	}
	
	//maze with obstical 
	public static void pathWithObstical(String p, Boolean[][] maze, int row, int col) {
		if(row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[row][col]) {
			return;
		}
		
		if(row < maze.length-1) {
			pathWithObstical(p+'W', maze, row+1, col);
		}
		
		if(col < maze[0].length-1) {
			pathWithObstical(p+'R', maze, row, col+1);
		}
	}
	

}
