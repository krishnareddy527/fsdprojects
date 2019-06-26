package comm.example.springdemo;

import org.springframework.stereotype.Component;

public class DOGCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Feed Your Puppy Today";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
