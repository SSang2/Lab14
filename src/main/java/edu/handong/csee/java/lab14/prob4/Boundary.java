package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	private static int [] arr = new int[5];
	private static int cnt = 0;
	public void receive(int num) throws ArrayIndexOutOfBoundsException
	{
		int i = cnt;
		arr[i] = num;
		cnt++;
		System.out.printf("arr[%d] <- %d\n", i, num);
	}
}
