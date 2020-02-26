/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11;

import java.util.ArrayList;

/**
 *
 * @author Nurullah
 */

// A node of chains 
public class HashNode<V> 
{ 
	//K key; 
	V value; 

	// Reference to next node 
	HashNode<V> next; 

	// Constructor 
	public HashNode(V value) 
	{ 
		//this.key = key; 
		this.value = value; 
	} 

    @Override
    public String toString() {
        return "" + value + " =>" + next;
    }
   
} 

// Class to represent entire hash table 
class Map<V> 
{ 
	// bucketArray is used to store array of chains 
	public ArrayList<HashNode<V>> bucketArray; 

	// Current capacity of array list 
	public int numBuckets; 

	// Current size of array list 
	private int size; 

	// Constructor (Initializes capacity, size and 
	// empty chains. 
	public Map() 
	{ 
		bucketArray = new ArrayList<>(); 
		numBuckets = 5; 
		size = 0; 

		// Create empty chains 
		for (int i = 0; i < numBuckets; i++) 
			bucketArray.add(null); 
	} 

	public int size() { return size; } 
	public boolean isEmpty() { return size() == 0; } 

	// This implements hash function to find index 
	// for a key 
	private int getBucketIndex(V key) 
	{ 
		int hashCode = key.hashCode(); 
		int index = hashCode % numBuckets; 
		return index; 
	} 

	// Method to remove a given key 
	public V remove(V key) 
	{ 
		// Apply hash function to find index for given key 
		int bucketIndex = getBucketIndex(key); 

		// Get head of chain 
		HashNode<V> head = bucketArray.get(bucketIndex); 

		// Search for key in its chain 
		HashNode<V> prev = null; 
		while (head != null) 
		{ 
			// If Key found 
			if (head.value.equals(key)) 
				break; 

			// Else keep moving in chain 
			prev = head; 
			head = head.next; 
		} 

		// If key was not there 
		if (head == null) 
			return null; 

		// Reduce size 
		size--; 

		// Remove key 
		if (prev != null) 
			prev.next = head.next; 
		else
			bucketArray.set(bucketIndex, head.next); 

		return head.value; 
	} 

	// Returns value for a key 
	public V get(V key) 
	{ 
		// Find head of chain for given key 
		int bucketIndex = getBucketIndex(key); 
		HashNode<V> head = bucketArray.get(bucketIndex); 

		// Search key in chain 
		while (head != null) 
		{ 
			if (head.value.equals(key)) 
				return head.value; 
			head = head.next; 
		} 

		// If key not found 
		return null; 
	} 

	// Adds a key value pair to hash 
	public void add(V value) 
	{ 
		// Find head of chain for given key 
		int bucketIndex = getBucketIndex(value); 
		HashNode<V> head = bucketArray.get(bucketIndex); 

		// Check if key is already present 
		while (head != null) 
		{ 
			if (head.value.equals(value))  // aynı elemanı eklememek için kontrol 
			{ 
				head.value = value; 
				return; 
			}
			head = head.next; 
		} 

		// Insert key in chain 
		size++; 
		head = bucketArray.get(bucketIndex); 
		HashNode<V> newNode = new HashNode<V>(value); 
		newNode.next = head; 
		bucketArray.set(bucketIndex, newNode); 

		// If load factor goes beyond threshold, then 
		// double hash table siz
		if ((1.0*size)/numBuckets >= 5) 
		{ 
			ArrayList<HashNode<V>> temp = bucketArray; 
			bucketArray = new ArrayList<>(); 
			numBuckets = 2 * numBuckets; 
			size = 0; 
			for (int i = 0; i < numBuckets; i++) 
				bucketArray.add(null); 

			for (HashNode<V> headNode : temp) 
			{ 
				while (headNode != null) 
				{ 
					add(headNode.value); 
					headNode = headNode.next; 
				} 
			} 
		} 
	} 
        
         void print(){
            for(int i = 0; i < numBuckets; i++ ){
                System.out.println(bucketArray.get(i)+" ");
            }
        }

    @Override
    public String toString() {
        return " "+ numBuckets ;
    }

         
         
	// Driver method to test Map class 
	public static void main(String[] args) 
	{ 
		Map<Integer> map = new Map<>(); 
		map.add(1); 
		map.add(2 ); 
		map.add(4); 
		map.add(5);
		map.add(15);
		map.add(25);
		map.add(355);
		map.add(455);
		map.add(8); 
		map.add(10); 
                map.add(20);
		map.add(14); 
		map.add(598);
		map.add(749); 
		map.add(3); 
                map.add(56);
                map.add(56);
                map.add(22);
                map.print();
                System.out.println("");
                map.remove(10);
                map.print();
                System.out.println("");
                System.out.println("eleman sayısı : "+map.size);
//		System.out.println(map.size()); 
//		System.out.println(map.remove("this")); 
//		System.out.println(map.remove("this")); 
//		System.out.println(map.size()); 
//		System.out.println(map.isEmpty()); 
	} 
} 
