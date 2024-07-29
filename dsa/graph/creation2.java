package dsa.graph;
import java.util.*;
//creating a simple directed wiighted graph

public class creation2 {
	static class edge{
		int scr;  //source
		int dest; //destination
		int wt;   //weight
		
		edge(int s, int d,int wt){
			this.scr = s;
			this.dest = d;
			this.wt = wt;
		}
	}
	
	public static void createGraph(ArrayList<edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<edge>();   // Initialize each vertex's with empty Arraylist
		}
		 // Add edges to the graph
		graph[0].add(new edge(0,2,1));
		
		graph[1].add(new edge(1,2,10));
		graph[1].add(new edge(1,3,11));
		
		graph[2].add(new edge(2,0,20));
		graph[2].add(new edge(2,1,21));
		graph[2].add(new edge(2,3,22));
		
		graph[3].add(new edge(3,1,31));
		graph[3].add(new edge(3,2,32));
	}
	
	public static void main(String args[]) {
		int v = 4;  // Number of vertices in the graph
		ArrayList<edge> graph[] = new ArrayList[v];   // Array of ArrayLists to represent the graph
		createGraph(graph);
		
		// print 2's neighbours 
		for(int i=0; i<graph[2].size(); i++ ) {
			edge e = graph[2].get(i);
			System.out.println("2's neighbour " +e.dest + " weight " + e.wt );
		}
	}

}
