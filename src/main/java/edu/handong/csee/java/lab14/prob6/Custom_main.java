package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;		//import package of java Scanner

public class Custom_main {		//public modifier class Custom_main
	public static void main(String[] args)		//public void main method
	{
		String name, race;		//call type of String class called name and race
		int age = 0;			//call integer age
		Scanner keyboard = new Scanner(System.in);		//instantiate Scanner class called keyboard
		CustomID obj = new CustomID();		//instantiate CustomID class called obj
		boolean repeat = true;		//boolean expression called repeat goes with true

		while(repeat)	//which its repeat
		{
			try {		//try
				if(obj.getState() == 0) {		//if obj's getState method is equals to 0
					System.out.print("Enter your name: ");		//print out "Enter your name:"
					name = keyboard.nextLine();		//input the String value to name
					obj.set_name(name);		//call obj's set_name method which gives value of name 
				}
				else if(obj.getState() == 1) {	//if obj's getState method is equals to 1
					System.out.print("Enter your age: ");	//print out "Enter your age: "
					age = keyboard.nextInt();		//input the integer value to age
					keyboard.nextLine();		//gets input
					obj.set_age(age);		//call obj's set_age method which gives value of age
				}
				else if(obj.getState() == 2) {		//if obj's getState method is equals to 2
					System.out.print("Enter your race: ");		//print out "Enter your race: "
					race = keyboard.nextLine();		//input the integer value to race
					obj.set_race(race);		//call obj's set_race method which gives value of race
				}
			}
			catch(Exception e){		//catch Exception e
				System.out.println(e.getMessage());		//print out the error message
				continue;		//continue the process
			}
		}
	}
}
