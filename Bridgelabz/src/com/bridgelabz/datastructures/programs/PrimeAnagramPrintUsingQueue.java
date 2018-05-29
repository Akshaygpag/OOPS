/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.datastructures.programs;

import java.util.List;

import com.bridgelabz.algorithm.impl.QueueImpl;
import com.bridgelabz.algorithm.interfaces.Queue;
import com.bridgelabz.algorithms.PrimeAnagramsAndPalindrome;
import com.bridgelabz.algoritms.util.AlgorithmUtil;

public class PrimeAnagramPrintUsingQueue {

    /**
     * @param args
     * 
     */
    public static void main(String[] args) {
	// THIS METHOD WILL CALL THE PRIMEANAGRAMS TO BE ADDED TO QUEUE AND POP AND
	// PRINT THEM

	Queue primeQueue = new QueueImpl();
	Integer[] allPrimeNumbers = AlgorithmUtil.findPrimeNumbers(1000);

	List<Integer> primeAnagrams = PrimeAnagramsAndPalindrome.findAnagramPrimes(allPrimeNumbers);

	for (Integer integer : primeAnagrams) {

	    Node<Integer> n = new Node<Integer>();
	    n.setInfo(integer);
	    primeQueue.enqueue(n);

	}
	
	
	while(!primeQueue.isEmpty()) {
	    
	    
	    
	    System.out.print(primeQueue.dequeue().getInfo().toString()+" ");
	    
	    
	}
	
	
    }

}
