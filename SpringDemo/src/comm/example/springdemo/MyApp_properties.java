package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp_properties {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties_ApplicationContext.xml");
		
		
		TenniesCoach myCoach = context.getBean("myTenniesCoach" , TenniesCoach.class);
		
		/*
		 * System.out.println();
		 * System.out.println("Daily work out tip: "+myCoach.getDailyWorkOut());
		 * System.out.println("Daily fortune tip: "+myCoach.FortuneService());
		 * System.out.println("coach gmail: "+myCoach.getEmialAddress());
		 * System.out.println("Coach team: "+myCoach.getTeam());
		 */
		TenniesCoach alphaCoach = context.getBean("myTenniesCoach" , TenniesCoach.class);
		System.out.println("sharing same resources:  "+(myCoach == alphaCoach));
		context.close();
	}

}
