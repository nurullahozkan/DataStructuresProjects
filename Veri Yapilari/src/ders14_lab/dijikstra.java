/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders14_lab;

/**
 *
 * @author Nurullah
 */
import java.util.*; 
public class dijikstra { 
	public int dist[]; 
	public Set<Integer> settled; 
	public PriorityQueue<Node> pq; 
	public int V; 
	List<List<Node> > adj; 

	public dijikstra(int V) 
	{ 
		this.V = V; 
		dist = new int[V]; 
		settled = new HashSet<Integer>(); 
		pq = new PriorityQueue<Node>(V, new Node()); 
	} 

	public void dijkstra(List<List<Node> > adj, int src) 
	{ 
		this.adj = adj; 

		for (int i = 0; i < V; i++) 
			dist[i] = Integer.MAX_VALUE; 

		pq.add(new Node(src, 0)); 

		dist[src] = 0; 
		while (settled.size() != V) { 

			int u = pq.remove().node; 
 
			settled.add(u); 

			e_Neighbours(u); 
		} 
	} 

	private void e_Neighbours(int u) 
	{ 
		int edgeDistance = -1; 
		int newDistance = -1; 

		for (int i = 0; i < adj.get(u).size(); i++) { 
			Node v = adj.get(u).get(i); 

			if (!settled.contains(v.node)) { 
				edgeDistance = v.cost; 
				newDistance = dist[u] + edgeDistance; 

				if (newDistance < dist[v.node]) 
					dist[v.node] = newDistance; 

				pq.add(new Node(v.node, dist[v.node])); 
			} 
		} 
	} 
}
 

