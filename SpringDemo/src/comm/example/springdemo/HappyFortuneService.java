package comm.example.springdemo;

public class HappyFortuneService implements FortuneService {
	
	
	public HappyFortuneService() {
		System.out.println("Happy Fortune Service: object created");
	}

	@Override
	public String getDailyFortune() {
		return "today is your Lucky day";
	}

}
