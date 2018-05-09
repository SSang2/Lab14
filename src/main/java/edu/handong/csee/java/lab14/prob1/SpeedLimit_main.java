package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;	//import java scanner
import java.util.Random;	//import java random access

public class SpeedLimit_main {	//public modifier class SpeedLimit_main

	public static void main(String[] args) {		//public void main method
		Scanner keyboard = new Scanner(System.in);		//instantiate Scanner class called keyboard
		Random rand = new Random();		//instantiate Random class called rand
		int limit = 0, speed = 0;		//declare integer limit and speed are equal to 0

		System.out.print("Set the speed limit, officer: ");		//print "Set the speed limit, officer: "
		limit = keyboard.nextInt();		//input the limit
		speed = rand.nextInt(101);		//input the limit (nextInt into 101)

		SpeedLimiter lim = new SpeedLimiter(limit, speed);		//instantiate SpeedLimiter class called lim which is includes the limit and speed

		lim.warnSpeedLimit();		//call the lim's warnSpeedLimit method

		keyboard.close();		//close (end)

	}

}
