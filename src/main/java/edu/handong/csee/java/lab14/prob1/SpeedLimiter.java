package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter {		//public modifier class SpeedLimiter
	private int speed = 0;		//declare the private integer speed = 0 
	private int limit = 0;		//declare the private integer limit = 0 
	public SpeedLimiter(int limit, int speed)	//public modifier method SpeedLimiter which is covers integers limit and speed
	{
		this.limit = limit;		//save limit value to limit
		this.speed = speed;		//save speed value to speed
	}

	public void warnSpeedLimit()		//public void method warnSpeedLimit
	{
		try {		//try
			if(this.speed > this.limit)		//if this.speed is bigger than this.limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");		////throw exception String("Speed Limit km exceeded!)
			}
			System.out.println("You are a law abiding citizen!");	//print out "You are a law abiding citizen!"
		}catch(Exception e) {		//catch a throw command and declare the Exception class called e
			System.out.println(e.getMessage());		//print out the message 
			System.out.println("You are being fined. ");		//print out "You are being fined. "
		}
		System.out.println("Your current speed: " + this.speed);  //print out "Your current speed: "
	}
}
