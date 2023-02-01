// Author : Ansh Kushwaha | 16/01/2023

package graph;

import java.util.ArrayList;

public class Graph {
	private ArrayList<ArrayList<Integer>> adjL;
	
	public Graph() {
		adjL = new ArrayList<ArrayList<Integer>>();
	}
	
	public void addEdge(int u, int v) {
		adjL.get(u).add(v);
		adjL.get(v).add(u);
	}
}
