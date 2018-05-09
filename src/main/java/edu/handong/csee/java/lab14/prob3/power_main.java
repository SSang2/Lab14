package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;		//import the package of java scanner 

public class power_main {	//public modifier class power_main
	public static final Powercalc my_calculator = new Powercalc();	//instantiate Powercalc class which is public static final modifier called my_calculator
	public static final Scanner in = new Scanner(System.in);	//instantiate Scanner class which is public static final modifier called in

	public static void main(String[] args) {	//public static main method
		while (in.hasNextInt()) {		//while in has integer variable
			int n = in.nextInt();		//get input integer to integer n variable
			int p = in.nextInt();		//get input integer to integer p variable

			try {		//try
				System.out.println(my_calculator.power(n, p));	//print out the power	
			} catch (Exception e) {		//catch the Exception as e
				System.out.println(e);		//print out the error
			}
		}
	}


}
