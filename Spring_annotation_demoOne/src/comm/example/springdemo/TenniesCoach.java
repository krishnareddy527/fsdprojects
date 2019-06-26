package comm.example.springdemo;

import org.springframework.stereotype.Component;

public class TenniesCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "No Practice today , sleep well";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
