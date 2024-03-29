package comm.example.springhome;

import java.util.Random;

public class DailyFortune implements FortuneMessages {
	
	public DailyFortune() {
		super();
		System.out.println("Daily Fortune Service: object created");
	}

	private String[] greetings = {
			"Hey, Hey man, or Hi",
			"How�s it going? or How are you doing?",
			"What�s up?, What�s new?, or What�s going on?",
			"How�s everything ?, How are things?, or How�s life?",
			"How�s your day? or How�s your day going?",
			"Good to see you or Nice to see you",
			"Long time no see or It�s been a while ",
			"It�s nice to meet you or Pleased to meet you",
			"How have you been?",
			"How do you do? "
	};
	
	private Random r = new Random();
	
	@Override
	public String getMyFortune() {
		int x = r.nextInt(greetings.length);
		return greetings[x];
	}

}
