package comm.example.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService myFortuneService;
	
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(comm.example.springdemo.FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Track Tips";
	}

	@Override
	public String FortuneService() {
		return myFortuneService.getDailyFortune();
	}

}
