package comm.example.springdemo;

public class BaseBallCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public BaseBallCoach() {
		System.out.println("Base Ball Service: object created");
	}
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.myFortuneService = fortuneService;
		System.out.println("Base Ball Service: dependecy injection is performed");
	}
	
	
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
		System.out.println("setMyFortuneService: setter injection performed.");
	}

	@Override
	public String getDailyWorkOut() {
		return "Base ball tips";
	}

	@Override
	public String FortuneService() {
		return myFortuneService.getDailyFortune();
	}

}
