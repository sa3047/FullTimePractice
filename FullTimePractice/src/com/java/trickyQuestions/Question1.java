package com.java.trickyQuestions;

/*
 * Integer.MIN_VALUE = -2147483648
 * Double.MIN_VALUE = 4.9E-324
 * This questions is tricky because unlike the Integer, 
 * where MIN_VALUE is negative, both the MAX_VALUE and MIN_VALUE of the Double class are positive numbers. 
 * The Double.MIN_VALUE is 2^(-1074), a double constant whose magnitude is the least among all double values. 
 * So unlike the obvious answer, this program will print 0.0 because Double.MIN_VALUE is greater than 0
 */

/*
 * This question challenge that misconception by putting return statement in try or catch block or 
 * calling System.exit from try or catch block. Answer of this tricky question in Java is that finally block 
 * will execute even if you put return statement in try block or catch block 
 * but finally block won't run if you call System.exit form try or catch.
 */
public class Question1 {
	public static void main(String[] args) {
		try {
			System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
			System.out.println("before return statment");
			// return
			System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("In finally block");
		}

	}
	
/*
 * while overloading in return type is not consider in function signature
 * only function name and parameters are considered 
 */
	public String getDescription(Object obj) {
		return obj.toString();
	}

	public String getDescription1(String obj) {
		return obj;
	}

	public void getDescription(String obj) {
		return;
	}

	void getDescription2(Object obj) {

	}
}
