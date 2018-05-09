package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception{		//public modifier class CustomID and inherits Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};	//call mRace that has "Vulcans", "Romulan", "Klingons"
	private String name = "";	//call String class type called name 
	private int age = 0;		//call integer class type called age
	private String race = "";	//call String class type called race
	private int state = 0;		//call integer class type called state

	public void set_name(String str) throws Exception	////void method set_Name gets String str and throws Exception
	{
		if(str.length() < 5) {		//if length of str is smaller than 5
			state = 0;		//state value is 0
			throw new Exception("Your name is short! Try again!");	//throw Exception "Your name is short! Try again!"
		}

		else {		//else
			this.name = str;	//input str to name
			System.out.println("Name is valid");		//print out "Name is valid"
			System.out.println("Name: " + this.name);	//print out "Name: "
			state++;		//increase state one by one
		}
	}

	public void set_age(int num) throws Exception		//set_Age method gets num and throws Exception
	{
		if(num < 18) {		//if the num is less than 18
			state = 1;		//state value is 1
			throw new Exception("You are too young! Try again!");		//throw Exception You are too young! Try again!"
		}
		else {		//else
			this.age = num;		//input num to age
			System.out.println("Age is valid");		//print out "Age is valid"
			System.out.println("Age: " + this.age);	//print out "Age: "
			state++;		//increase state one by one
		}
	}

	public void set_race(String race) throws Exception{		//set_race method gets race and throws Exception
		for(int i = 0; i < races.length; i++)		//repeat the array of race
		{
			if(races[i].equals(race)) {		//if the races[i] is equals to race value
				this.race = races[i];		//input races[i] to race
				System.out.println("Race is valid");		//print out "Race is valid"
				System.out.println("Race: " + races[i]);	//print out "Race: "
				state = 0;			//state value is 0
				return;		//end
			}
		}
		state = 2;		//state value is 2
		throw new Exception("Human! Try again.");		//throw Exception "Human! Try again."
	}
	public int getState()		//public modifier method getState
	{
		return state;		//return state
	}
}