package comm.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * Coach myCoach = context.getBean("myCoach" , TenniesCoach.class);
		 * System.out.println(myCoach.getDailyWorkout());
		 * 
		 * Coach myCoach= context.getBean("footballCoach" , FootballCoach.class);
		 * System.out.println(myCoach.getDailyWorkout());
		 * System.out.println(myCoach.getDailyFortune());
		 * 
		 * Coach myCoach= context.getBean("DOGCoach" , DOGCoach.class);
		 * System.out.println(myCoach.getDailyWorkout());
		 * 
		 * context.close();
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach myCoach = context.getBean("swimCoach" , Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}
}
