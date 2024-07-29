package dsa.graph;
import java.util.*;
public class AllPathFromScrToTarget {
	static class edge{
		int scr;
		int dest;
		
		edge(int s, int d){
			this.scr = s;
			this.dest = d;
		}
	}
	
	
	public static void createGraph(ArrayList<edge> graph[]) {
		boolean vis[] = new boolean[7];
		
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new edge(0,1));
		graph[0].add(new edge(0,2));
		
		graph[1].add(new edge(1,0));
		graph[1].add(new edge(1,3));
		
		graph[2].add(new edge(2,0));
		graph[2].add(new edge(2,4));
		
		graph[3].add(new edge(3,1));
		graph[3].add(new edge(3,4));
		graph[3].add(new edge(3,5));
		
		graph[4].add(new edge(4,2));
		graph[4].add(new edge(4,3));
		graph[4].add(new edge(4,5));
		
		graph[5].add(new edge(5,3));
		graph[5].add(new edge(5,4));
		graph[5].add(new edge(5,6));
		
		graph[6].add(new edge(6,5));
		
	}
	
	//O(v^v)
	public static void allPath(ArrayList<edge> graph[], int curr, boolean vis[], String path ,int target) {
		if(curr == target) {
			System.out.println(path);
			return;
		}

		for(int i=0; i<graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			
			if(vis[e.dest] == false) {
				vis[curr] = true;
				allPath(graph, e.dest, vis, path+e.dest ,target );
				vis[curr] = false;
			}
		}
	}
	
	public static void main(String args[]) {
		int v = 7;
		ArrayList<edge> graph[] = new ArrayList[v];
		createGraph(graph);
		int scr = 0, target = 5;
		boolean vis[] = new boolean[v];
		String path = "0";
		allPath(graph, scr, vis, path,target);
	}

}
