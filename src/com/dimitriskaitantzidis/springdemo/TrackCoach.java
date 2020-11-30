package com.dimitriskaitantzidis.springdemo;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
}
