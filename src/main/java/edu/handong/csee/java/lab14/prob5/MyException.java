package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {		//public modifier class MyException inherits Exception
	private String message = null;		//private modifier String class message which is null

	public MyException() {	//MyException constructor
		super();	//call super class constructor
	}

	public MyException(String message) {		//public modifier class MyException which gets String message
		super(message);	//call super class constructor which is given message
		this.message = message;		//get instance variable 'message'
	}

	public MyException(Throwable cause) {	//public constructor which receive cause
		super(cause);		//call super class and it gives value of cause
	}

	public String toString() {		//call toString method, it returns String
		return message;		//return message
	}
}
