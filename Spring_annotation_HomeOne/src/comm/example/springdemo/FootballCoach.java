package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sports.properties")
public class FootballCoach implements Coach {
	
	@Value("${foo.emailAddress}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	/*
	 * @Autowired //@Qualifier("randomFortuneService")
	 * 
	 * @Qualifier("fileFortuneService")
	 */
	private FortuneService myFortuneService;
	
	public FootballCoach() { super(); }
	
	@Override
	public String getDailyWorkout() { return "practice forward today for two hours."; }
	
	
	@Override
	public String getDailyFortune() { return myFortuneService.getFortune(); }
	
	@PostConstruct
	public void doSomeInitStuff() { System.out.println(">>Inside FootballCoach doSomeInitStuff()"); }
	
	@PreDestroy
	public void doSomeCleanUPStuff() { System.out.println(">>Inside FootballCoach doSomeCleanUPStuff()"); }

	public String getEmailAddress() { return emailAddress; }

	public String getTeam() { return team; }

	@Autowired
	//@Qualifier("fileFortuneService")
	public void setMyFortuneService(@Qualifier("randomFortuneService") FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	
	
	
}
