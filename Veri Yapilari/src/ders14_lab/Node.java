/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders14_lab;

import java.util.Comparator;

/**
 *
 * @author Nurullah
 */

public class Node implements Comparator<Node> { 
	public int node; 
	public int cost; 

	public Node() 
	{ 
	} 

	public Node(int node, int cost) 
	{ 
		this.node = node; 
		this.cost = cost; 
	} 

	@Override
	public int compare(Node node1, Node node2) 
	{ 
		if (node1.cost < node2.cost) 
			return -1; 
		if (node1.cost > node2.cost) 
			return 1; 
		return 0; 
	} 
}