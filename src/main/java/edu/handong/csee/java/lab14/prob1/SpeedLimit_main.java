package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;
import java.util.Random;

public class SpeedLimit_main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int limit = 0, speed = 0;

		System.out.print("Set the speed limit, officer: ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);

		SpeedLimiter lim = new SpeedLimiter(limit, speed);

		lim.warnSpeedLimit();

		keyboard.close();

	}

}
