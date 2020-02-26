/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders13_lab;

/**
 *
 * @author Nurullah
 */
import java.util.*;

public class breadthFirstSearch {

    private int V; // köşeler 
    private LinkedList<Integer> adj[]; // komşuluk listesi

    public breadthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        breadthFirstSearch g = new breadthFirstSearch(11);

        g.addEdge(0, 3);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(3, 7);
        g.addEdge(3, 8);
        g.addEdge(2, 6);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(8, 9);

        g.BFS(0);
    }
}
