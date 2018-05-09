package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;	//import package of java Scanner

public class My_main {		//public modifier class My_maun
	public static void main(String[] args){		//public void main method
		try{		//try
			Scanner keyboard = new Scanner(System.in);	
			String str = keyboard.nextLine();	//call the class that type of string called str and gets input integer 
			My_main.myTest(str);		//call My_main class.myTest method, it gives str value
		} catch(MyException mae){		//catch MyException called mae
			System.out.println("Inside catch block: " + mae);	//print out "Inside catch block: "
		}
	}

	static void myTest(String str) throws MyException{ //call static modifier void method myTest and throws error to MyException
		if(str.equals("null")){		//if str equals to null
			throw new MyException("String val is null");		//throw to MyExceptiona and print "String val is null"
		}
		else	//else
			System.out.println("String val is:" + str);		// print out "String val is:"
	}
}

