package comm.example.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "comm.example.springdemo")
public class SportsConfig {
	@Bean
	public FortuneService fortuneService() {
		//return new HappyFortuneService();
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach sc=new SwimCoach();
		sc.setFortuneService(fortuneService());
		return sc;
	}
}
