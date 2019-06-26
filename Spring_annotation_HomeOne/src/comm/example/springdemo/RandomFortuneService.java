package comm.example.springdemo;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	String []messages = new String[10];
	Random r = new Random();
	File file=null;
	Scanner sc=null;
	public RandomFortuneService() {
		super();
	}
	
	@PostConstruct
	public void doSomeInitStuff() {
		System.out.println(">>Inside RandomFortuneService doSomeInitStuff()");
		file = new File("fortunes.txt");
	}
	
	@Override
	public String getFortune() {
		try {
			sc = new Scanner(file);
			int i=0;
			while (sc.hasNextLine()) {
				 messages[i++] =  sc.nextLine();
			}    
		}catch (Exception e) {
			e.printStackTrace();
		}
		return messages[r.nextInt(10)];
	}
	
	@PreDestroy
	public void doSomeCleanUPStuff() {
		System.out.println(">>Inside RandomFortuneService doSomeCleanUPStuff()");
		sc=null;
		file=null;
	}

}
