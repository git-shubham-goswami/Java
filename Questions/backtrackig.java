package Questions;
import java.util.*;
public class backtrackig {
	public static void main(String[] args) {
		
		Boolean[][] maze = {{true,true,true},
				            {true,true,true},
				            {true,true,true}
				            };
		
		int[][] path = new int[maze.length][maze[0].length];
		
		pritAllPath("",maze,0,0,path,1);
		//allPath("",maze,0,0);
	} 
	
	public static void allPath(String p, Boolean[][] maze, int r, int c) {
         
		if(r == maze.length-1 && c == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		
		if(r<maze.length-1) {
			allPath(p+"W", maze, r+1, c);
		}
		
		if(c<maze[0].length-1) {
			allPath(p+"R", maze, r, c+1);
		}
		
		if(r>0) {
			allPath(p+"U", maze, r-1, c);
		}
		
		if(c>0) {
			allPath(p+"L",maze, r, c-1);
		}
		
		maze[r][c] = true;
		
		
		
	}
	
	
	public static void pritAllPath(String p, Boolean[][] maze, int r, int c, int[][] path, int stepno) {
        
		if(r == maze.length-1 && c == maze[0].length-1) {
			path[r][c] = stepno;
			
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println(p);
			System.out.println();
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		path[r][c] = stepno;
		if(r<maze.length-1) {
			pritAllPath(p+"W", maze, r+1, c, path, stepno+1);
		}
		
		if(c<maze[0].length-1) {
			pritAllPath(p+"R", maze, r, c+1, path, stepno+1);
		}
		
		if(r>0) {
			pritAllPath(p+"U", maze, r-1, c, path, stepno+1);
		}
		
		if(c>0) {
			pritAllPath(p+"L",maze, r, c-1, path, stepno+1);
		}
		
		maze[r][c] = true;
		path[r][c] = 0;
		
		
	}

}
