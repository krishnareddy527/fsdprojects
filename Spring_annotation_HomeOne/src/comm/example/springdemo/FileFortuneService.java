package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Welcome, Join the club";
	}

}
