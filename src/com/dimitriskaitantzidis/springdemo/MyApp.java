package com.dimitriskaitantzidis.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object
		ICoach theCoach = new TrackCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
