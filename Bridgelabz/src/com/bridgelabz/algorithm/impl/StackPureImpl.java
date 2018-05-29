/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.algorithm.impl;

import com.bridgelabz.algorithm.interfaces.Stack;
import com.bridgelabz.datastructures.programs.Node;

public class StackPureImpl implements Stack {
    private Node top;

    public Node getTop() {
	return top;
    }

    public void setTop(Node top) {
	this.top = top;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bridgelabz.algorithm.interfaces.Stack#stack()
     */
    @Override
    public Stack stack() {
	// bridgeit
	return new StackPureImpl();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.bridgelabz.algorithm.interfaces.Stack#push(com.bridgelabz.datastructures.
     * programs.Node)
     */
    @Override
    public void push(Node item) {
	item.setNext(top);
	top = item;

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bridgelabz.algorithm.interfaces.Stack#pop()
     */
    @Override
    public Node pop() {

	if (top != null) {
	    Node returningNode = top;
	    top = top.getNext();
	    return returningNode;

	}

	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bridgelabz.algorithm.interfaces.Stack#peek()
     */
    @Override
    public Node peek() {
	if (top != null) {
	    return top;

	}
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bridgelabz.algorithm.interfaces.Stack#isEmpty()
     */
    @Override
    public boolean isEmpty() {
	if (top == null) {
	    return true;
	}
	return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bridgelabz.algorithm.interfaces.Stack#size()
     */
    @Override
    public int size() {
	int size = 0;
	Node current = top;
	while (current != null) {
	    size++;

	    current = current.getNext();
	}
	return size;

    }

}
