/**
 * @author Akshay
 * @version 1.0.0
 * @since 25-May-2018
 */

package com.bridgelabz.datastructures.dates;

import com.bridgelabz.algorithm.impl.OrderedListImpl;
import com.bridgelabz.algorithm.interfaces.OrderedList;
import com.bridgelabz.datastructures.programs.Node;

/**
 * @author bridgeit
 *
 */
public class Week implements Comparable<Week>  {

   private final OrderedList<Node> daysInWeek = new OrderedListImpl();

  

    @Override
public String toString() {
//    return "Week [daysInWeek=" +  + "]";
    
    
     daysInWeek.printElements();
    return null;
}



    public OrderedList<Node> getDaysInWeek() {
        return daysInWeek;
    }



    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Week o) {
	// bridgeit 
	return 0;
    }


    
    
    
}
