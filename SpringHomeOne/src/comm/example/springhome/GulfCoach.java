package comm.example.springhome;

public class GulfCoach implements Coach {
	
	FortuneMessages myFortuneMessages;
	
	
	
	public GulfCoach() {
		super();
	}

	public void setMyFortuneMessages(FortuneMessages myFortuneMessages) {
		this.myFortuneMessages = myFortuneMessages;
		System.out.println("setMyFortuneMessages: setter injection performed.");
	}

	@Override
	public String getDailyTips() {
		return "don't give up Champ!!!!";
	}

	@Override
	public String getDailyfortunes() {
		return myFortuneMessages.getMyFortune();
	}

}
