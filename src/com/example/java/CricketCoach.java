package com.example.java;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 50 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public CricketCoach() {
		super();
		System.out.println("CricketCoach: in Constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: in setter");
		this.fortuneService = fortuneService;
	}
	
	
	

}
