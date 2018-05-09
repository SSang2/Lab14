package edu.handong.csee.java.lab14.prob4;

public class Boundary {		//public modifier class Boundary
	private static int [] arr = new int[5];		//call the array of integer called arr and the size is 5
	private static int cnt = 0;		//call the integer i 
	public void receive(int num) throws ArrayIndexOutOfBoundsException	//call void method recieveValue which gets integer and it throw its exception
	{
		int i = cnt;	//initiate the integer i with cnt
		arr[i] = num;	//input num value to arr[i]
		cnt++;		//increase cnt one by one
		System.out.printf("arr[%d] <- %d\n", i, num);		//print the figure of arr
	}
}
