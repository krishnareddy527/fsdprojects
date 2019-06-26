package comm.example.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService myFortuneService;
	private String gmail;
	private String team;
	
	public CricketCoach() {
		super();
	}
	
	public CricketCoach(comm.example.springdemo.FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
		System.out.println("setMyFortuneService: setter injection in cricket performed.");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "practice fast bpowling today!!!";
	}
	@Override
	public String FortuneService() {
		return myFortuneService.getDailyFortune();
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	

}
