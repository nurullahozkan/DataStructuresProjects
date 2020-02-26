/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders14_lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nurullah
 */
public class main {

    public static void main(String arg[]) {
        int V = 5;
        int source = 0;
        List<List<Node>> adj = new ArrayList<List<Node>>();

        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        adj.get(0).add(new Node(1, 2));
        adj.get(0).add(new Node(3, 6));
        adj.get(1).add(new Node(2, 7));
        adj.get(1).add(new Node(4, 3));

        adj.get(2).add(new Node(4, 5));
        adj.get(2).add(new Node(3, 4));

        dijikstra dpq = new dijikstra(V);
        dpq.dijkstra(adj, source);
        
        System.out.println("0 = A");
        System.out.println("1 = B");
        System.out.println("2 = C");
        System.out.println("3 = D");
        System.out.println("4 = E");
        System.out.println("--------");

        for (int i = 0; i < dpq.dist.length; i++) {
            System.out.println(source + " noktasından " + i + " noktasına en kısa yol = "
                    + dpq.dist[i]);
        }
    }
}
