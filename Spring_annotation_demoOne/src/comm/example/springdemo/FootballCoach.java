package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
public class FootballCoach implements Coach {
	
	//Property level dependency injection
	@Autowired
	private FortuneService myFortuneService;
	
	
	public FootballCoach() {
		super();
	}
	
	/* //Constructor level dependency Injection
	 * 
	 * @Autowired public FootballCoach(FortuneService myFortuneService) { super();
	 * this.myFortuneService = myFortuneService; }
	 */	
	
	/* //setter level dependency Injection
	 * 
	 * @Autowired public void setMyFortuneService(FortuneService myFortuneService) {
	 * this.myFortuneService = myFortuneService; }
	 */
	
	/*
	 * // Custom Method level dependency Injection
	 * 
	 * @Autowired public void doSetter(FortuneService myFortuneService) {
	 * this.myFortuneService = myFortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "practice forward today for two hours.";
	}
	
	
	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}
	
	@PostConstruct
	public void doSomeInitStuff() {
		System.out.println(">>Inside FootballCoach doSomeInitStuff()");
	}
	
	@PreDestroy
	public void doSomeCleanUPStuff() {
		System.out.println(">>Inside FootballCoach doSomeCleanUPStuff()");
	}
}
