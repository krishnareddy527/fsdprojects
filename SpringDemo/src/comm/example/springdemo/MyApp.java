package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*Coach myCoach= (Coach) context.getBean("MyBaseBallCoach" , Coach.class);
		
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.FortuneService());
		
		System.out.println("\n");
		myCoach= (Coach) context.getBean("MyTrackCoach" , Coach.class);
		
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.FortuneService());*/
		
		TenniesCoach myCoach = context.getBean("TenniesCoach" , TenniesCoach.class);
		System.out.println();
		
		System.out.println("Daily work out tip: "+myCoach.getDailyWorkOut());
		//System.out.println("Daily fortune tip: "+myCoach.FortuneService());
		System.out.println("coach gmail: "+myCoach.getEmialAddress());
		System.out.println("Coach team: "+myCoach.getTeam());
		
		context.close();
	}

}
