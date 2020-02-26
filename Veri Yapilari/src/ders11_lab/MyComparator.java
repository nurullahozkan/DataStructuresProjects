/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11_lab;

import java.util.Comparator;

/**
 *
 * @author Nurullah
 */
public class MyComparator implements Comparator<HuffmanNode> { 
	public int compare(HuffmanNode x, HuffmanNode y) 
	{ 

		return x.data - y.data; 
	} 
} 
