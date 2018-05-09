package edu.handong.csee.java.lab14.prob3;

public class Powercalc {	//public modifier class Powercalc

	public long power(int n, int p) throws Exception	//throws Exception 
	{
		long result = 0;		//call long variable called result

		result = (long)Math.pow(n, p);		//change the value of power(n,p) to long type
		if(n < 0 || p < 0)	//if n is less than 0 or p is less than 0
		{
			throw new Exception("n or p should not be negative."); 		//throw the error "n or p should not be negative."
		}
		if(n == 0 && p == 0)	//if n is equals to 0 and p equals to 0
		{
			throw new Exception("n and p should not be zero.");		//throw the error "n and p should not be zero."
		}
		return result;	//return the value of result
	}
}
