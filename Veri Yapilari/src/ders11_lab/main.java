/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11_lab;

import static ders11_lab.huffmanCoding.printCode;
import java.util.PriorityQueue;
/**
 *
 * @author Nurullah
 */
public class main {
    public static void main(String[] args) 
	{ 
		int n = 6; 
		char[] charArray = { 'a', 'b', 'k', 'm', 'd', 'g' }; 
		int[] charfreq = { 50, 35, 20, 10, 8, 4 }; 

		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 

		for (int i = 0; i < n; i++) { 
                    
			HuffmanNode hn = new HuffmanNode(); 

			hn.c = charArray[i]; 
			hn.data = charfreq[i]; 

			hn.left = null; 
			hn.right = null; 
                        
			q.add(hn); 
		} 

		HuffmanNode root = null; 
                
		while (q.size() > 1) { 

			HuffmanNode x = q.peek(); 
			q.poll(); 

			HuffmanNode y = q.peek(); 
			q.poll(); 

			HuffmanNode f = new HuffmanNode(); 
 
			f.data = x.data + y.data; 
			f.c = '-'; 

			f.left = x; 
                        
			f.right = y; 

			root = f; 
 
			q.add(f); 
		} 

		printCode(root, ""); 
	} 
}
