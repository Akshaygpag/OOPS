/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.datastructures.programs;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.algoritms.util.AlgorithmUtil;
import com.bridgelabz.datastructures.dates.Week;
import com.bridgelabz.datastructures.dates.WeekDay;

/**
 * @author bridgeit
 *
 */
public class CalendarUsing2Stacks {
    static Map<Integer, Integer> days;
    static {
	days = new HashMap<Integer, Integer>();

	days.put(0, 31);
	days.put(1, 28);

	days.put(2, 31);

	days.put(3, 30);

	days.put(4, 31);

	days.put(5, 30);

	days.put(6, 31);

	days.put(7, 31);

	days.put(8, 30);

	days.put(9, 31);

	days.put(10, 30);
	days.put(11, 31);

    }
    public static void main(String[] args) {
   	// METHOD WILL TAKE COMMAND LINE ARG FOR MONTH AND YEAR AND PRODUCE CALENDAR
   	// USING THE QUEUE

   	java.util.Calendar calendarG = new GregorianCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]) - 1,
   		1);

   	int position = AlgorithmUtil.dayOfWeek(calendarG.get(java.util.Calendar.DATE),
   		calendarG.get(java.util.Calendar.MONTH) + 1, calendarG.get(java.util.Calendar.YEAR));

   	String startingDay = getDays()[position].name();

   	int counterDates = 0;
   	boolean isLeapYear = false;
   	if (calendarG.get(java.util.Calendar.MONTH) == 1) {

   	    // CHECK FOR LEAP YEAR
   	    isLeapYear = leapChecker(Long.parseLong(args[0]));
   	    if (isLeapYear) {

   		days.put(1, 29);
   	    }
   	}

   	int end = days.get(calendarG.get(java.util.Calendar.MONTH));
   	// System.out.println(end);
  
   	QueueUsingStack queue=new QueueUsingStack();
   	// adding the days to the queue
   	Week labels = new Week();

   	for (int i = 0; i < DAYS.values().length; i++) {

   	    WeekDay day = new WeekDay();
   	    day.setDate("");
   	    day.setDay(DAYS.values()[i].toString());
   	    Node addingDay = new Node();
   	    addingDay.setInfo(day);
   	    labels.getDaysInWeek().add(addingDay);
   	}
   	// added the days
   	Node headerlables = new Node();
   	headerlables.setInfo(labels);
   	queue.enqueue(headerlables);

   	/*
   	 * while (!labels.getDaysInWeek().isEmpty()) {
   	 * 
   	 * WeekDay n1 = (WeekDay) labels.getDaysInWeek().pop().getInfo(); }//
   	 */

   	// adding the dates
   	int start = 1;
   	for (int i = 0; i < 7 && start <= end; i++) {
   	    // MAX NUMBER OF ROWS IN A CALENDAR
   	    Week week = new Week();
   	    for (int j = 0; j < Days.values().length && start <= end; j++) {
   		// where 0 is sunday ......
   		if (j < position && i == 0) {

   		    WeekDay daysToAdd = new WeekDay();

   		    daysToAdd.setDate("");
   		    daysToAdd.setDay("");
   		    Node dayNode = new Node();
   		    dayNode.setInfo(daysToAdd);
   		    week.getDaysInWeek().add(dayNode);

   		    continue;
   		}

   		WeekDay daysToAdd = new WeekDay();

   		daysToAdd.setDate(String.valueOf(start));
   		start += 1;
   		daysToAdd.setDay("");
   		Node dayNode = new Node();
   		dayNode.setInfo(daysToAdd);
   		week.getDaysInWeek().add(dayNode);

   	    }
   	    Node wholeWeek = new Node();
   	    wholeWeek.setInfo(week);
   	    queue.enqueue(wholeWeek);

   	}
   	System.out.println("\n");

   	System.out.println("% java Calendar " + (calendarG.get(java.util.Calendar.MONTH) + 1) + " " + args[0] + " "
   		+ getMonths(calendarG.get(java.util.Calendar.MONTH)));
   	System.out.println("-------------------------------");
   	int queueSize = queue.size();
   	while (!queue.isEmpty()) {

   	    Node week = queue.dequeue();

   	    Week weekOne = (Week) week.getInfo();

   	    if (queueSize - 1 == queue.size()) {

   		while (!weekOne.getDaysInWeek().isEmpty()) {

   		    WeekDay dateInCalendar = (WeekDay) weekOne.getDaysInWeek().pop().getInfo();
   		    System.out.print(String.format("%4s", dateInCalendar.getDay()));

   		}
   		System.out.println();

   	    }

   	    else {

   		while (!weekOne.getDaysInWeek().isEmpty()) {

   		    WeekDay dateInCalendar = (WeekDay) weekOne.getDaysInWeek().pop().getInfo();
   		    System.out.print(String.format("%4s", dateInCalendar.getDate()));

   		}

   		System.out.println();

   	    }

   	}

   	// System.out.println(weekOne);
   	// remove this later
   	System.out.println("-------------------------------");

       }

       /**
        * this method will give the name used for days at specific position
        * 
        * @param date
        * @return
        *
        */
       private static String getDay(int date) {

   	Days[] days = Days.values();
   	return days[date].name();

       }

       /**
        * returns alldays in array format
        * 
        * @return
        *
        */
       private static Days[] getDays() {
   	Days[] days = Days.values();
   	return days;
       }

       /**
        * checks if the year is leap year or not
        * 
        * @param year
        * @return
        *
        */
       private static boolean leapChecker(long year) {
   	if (year % 400 == 0) {
   	    return true;
   	}
   	if (year % 4 == 0 && !(year % 100 == 0)) {
   	    return true;

   	}
   	return false;
       }

       static String getMonths(int month) {

   	Months[] months = Months.values();
   	return months[month].name();

       }

}
