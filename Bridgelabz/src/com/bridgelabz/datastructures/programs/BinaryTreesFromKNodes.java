/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.datastructures.programs;

import com.bridgelabz.functionalprogramming.util.Utility;

public class BinaryTreesFromKNodes {
    public static void main(String[] args) {

	System.out.println("Enter the number of test ");

	int tests = Utility.getIntergerValue();
	if (tests < 1 || tests > 1000) {

	    System.out.println("Invalid tests passed");
	    System.exit(1);

	}

	for (int i = 0; i < tests; i++) {

	    System.out.println("Enter the K nodes ");
	    int nodes = Utility.getIntergerValue();
	    if (nodes < 1 || nodes > 1000) {

		System.out.println("Invalid node passed");
		System.exit(1);

	    }
	    nodes = countBinaryTree(nodes);
	    System.out.println("The number of binary trees are : " + nodes);

	}

    }

    /**
     * @param nodes
     * @return
     * 
     */
    private static int countBinaryTree(int nodes) {

	return factorial(2 * nodes) / (factorial(nodes + 1) * factorial(nodes));

    }

    /**
     * @param i
     * @return
     * 
     */
    private static int factorial(int i) {

	if (i == 0) {
	    return 1;
	}
	return factorial(i - 1) * i;

    }
}
