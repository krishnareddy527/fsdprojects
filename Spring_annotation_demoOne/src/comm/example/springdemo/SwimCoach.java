package comm.example.springdemo;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;

	public SwimCoach() {
		super();
	}

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Don't go for Swim today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
