package edu.handong.csee.java.lab14.prob2;

import java.util.*;		//import the package

public class In_exception {		//public modifier class In_exception
	private int x = 0, y = 0;		//private modifier integer x and y 

	public In_exception()		//public method In_exception
	{}
	public void error_det() {		//public void method error_det

		try{		//try
			Scanner keyboard = new Scanner(System.in);	//instantiate Scanner class named keyboard
			System.out.print("x: ");	//print "x: "
			x = keyboard.nextInt();		//input integer value to x 
			System.out.print("y: ");	//print "y: "
			y = keyboard.nextInt();		//input integer value to y
			System.out.println(this.x/this.y);		//print out x and y
		}
		catch(ArithmeticException e){	//catch ArithmeticException error 
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());		//print out "java.lang.ArithmeticException: "
		}
		catch(InputMismatchException e){	//catch InputMismatchException error 
			System.out.println("java.util.InputMismatchException");		//print out "java.util.InputMismatchException"
		}
		catch(Exception e) {		//catch rest of other error
			System.out.println("Some other exception has occurred: " + e.getMessage());		//print out "Some other exception has occurred: "
		}
	}
}

