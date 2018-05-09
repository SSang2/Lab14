package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;		//import the Scanner package

public class Bound_main {		//public modifier class Bound_main
	public static void main(String[] args)		//public main method
	{
		Scanner keyboard = new Scanner(System.in);	//instantiate Scanner class called keyboard 
		int num = 0;		//call the integer num 
		Boundary arr = new Boundary();		//instantiate the Boundary class called arr
		boolean repeat = true;		//initiate the boolean expression called repeat with true
		while(repeat)		//while its repeat
		{
			try		//try
			{
				System.out.print("Enter an integer: ");		//print "Enter an integer: "
				num = keyboard.nextInt();		//integer num gets the input value
				arr.receive(num);		//arr receives the integer num
				}
			catch(ArrayIndexOutOfBoundsException e)		//catch the ArrayIndexOutOfBoundaryException called e
			{
				System.out.println("Invalid array index access!");		//print out "Invalid array index access!"
				repeat = false;		//boolean repeat gets false (exit)
			}
		}
	}
}

