package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;

public class My_main {
	public static void main(String[] a){
		try{
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			My_main.myTest(str);
		} catch(MyException mae){
			System.out.println("Inside catch block: " + mae);
		}
	}

	static void myTest(String str) throws MyException{
		if(str.equals("null")){
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is:" + str);
	}
}

