/**
 * @author Akshay
 * @version 1.0.0
 * @since 26-May-2018
 */

package com.bridgelabz.oops.programs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.oops.classes.User;

/**
 * @author bridgeit
 *
 */
public class ConfirmationMessage {

    /**
     * @param args
     * 
     */

    private static StringBuffer template = new StringBuffer("Hello <<name>>, We have your full"
	    + "name as <<full name>> in our system. your contact number is +91­xxxxxxxxxx."
	    + "Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX.");

    public static void main(String[] args) {
	// CREATE A USER OBJECT AND STORE AND REPLACE WITH THE EXISTING MESSAGE

	User user = new User();
	user.setName("Akshay");
	user.setFullName("Akshay Guruprasad");
	user.setNumber("8951541493");
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	Date today = new Date();
	String todayDate = dateFormat.format(today);

	userDefinedMessage(todayDate, user);
	System.out.println(template);
    }

    /**
     * 
     * 
     */
    private static void userDefinedMessage(String todayDate, User user) {
	Pattern pattern = null;

	CharSequence cs = template;
	pattern = Pattern.compile("XX/XX/XXXX");
	Matcher m = pattern.matcher(cs);
	String result = m.replaceAll(todayDate);
	template = new StringBuffer(result);
	cs = template;
	pattern = Pattern.compile("xxxxxxxxxx");
	m = pattern.matcher(cs);
	result = m.replaceAll(user.getNumber());
	template = new StringBuffer(result);

	cs = template;
	pattern = Pattern.compile("<<name>>");
	m = pattern.matcher(cs);
	result = m.replaceAll(user.getName());
	template = new StringBuffer(result);

	cs = template;
	pattern = Pattern.compile("<<full name>>");
	m = pattern.matcher(cs);
	result = m.replaceAll(user.getFullName());
	template = new StringBuffer(result);

    }

}
