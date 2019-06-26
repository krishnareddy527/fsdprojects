package comm.example.springdemo;

public class TenniesCoach implements Coach {
	
	private String emialAddress;
	private String team;
	
	
	public TenniesCoach() {
		super();
		System.out.println(">>TeniesCoach: default constructor called");
	}

	public String getEmialAddress() {
		return emialAddress;
	}

	public void setEmialAddress(String emialAddress) {
		this.emialAddress = emialAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice back head volly ball today";
	}

	@Override
	public String FortuneService() {
		return null;
	}
	
	public void doMyInitStuff() {
		System.out.println(">>tenniescoach: inside doMyInitStuff()");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println(">>tenniescoach: inside doMyCleanUpStuff()");
	}

}
