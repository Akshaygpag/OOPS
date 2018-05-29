/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.datastructures.programs;

import java.util.List;

import com.bridgelabz.algorithm.impl.StackPureImpl;
import com.bridgelabz.algorithm.interfaces.Stack;
import com.bridgelabz.algorithms.PrimeAnagramsAndPalindrome;
import com.bridgelabz.algoritms.util.AlgorithmUtil;

public class PrintAnagramInReverse {

    /**
     * @param args
     * 
     */
    public static void main(String[] args) {

	Stack anagramStack = new StackPureImpl();

	Integer[] allPrimeNumbers = AlgorithmUtil.findPrimeNumbers(1000);

	List<Integer> primeAnagrams = PrimeAnagramsAndPalindrome.findAnagramPrimes(allPrimeNumbers);

	for (Integer integer : primeAnagrams) {

	    Node n = new Node();
	    n.setInfo(String.valueOf(integer));
	    anagramStack.push(n);

	}
	// ALL ITEMS ARE PUSHED

	int seperator = 0;

	// PRINTING THE NUMBERS IN REVERSE ORDER
	while (!anagramStack.isEmpty()) {

	    if (seperator != 0 && seperator % 2 == 0) {

		System.out.print(",");

	    }
	    StringBuffer reversingString = new StringBuffer(anagramStack.pop().getInfo().toString());

	    reversingString = reversingString.reverse();

	    System.out.print(reversingString + " ");

	    seperator++;

	}

    }

}
