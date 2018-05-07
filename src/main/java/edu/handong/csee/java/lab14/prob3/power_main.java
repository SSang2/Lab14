package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;

public class power_main {
	public static final Powercalc my_calculator = new Powercalc();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}


}
