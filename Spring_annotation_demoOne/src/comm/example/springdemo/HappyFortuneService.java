package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today is your lucky day, Lucky Boy";
	}
	
	@PostConstruct
	public void doSomeInitStuff() {
		System.out.println(">>Inside HappyFortuneService doSomeInitStuff()");
	}
	
	@PreDestroy
	public void doSomeCleanUPStuff() {
		System.out.println(">>Inside HappyFortuneService doSomeCleanUPStuff()");
	}

}
