package comm.example.springhome;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Coach myCoach = context.getBean("GulfCoach" , Coach.class );
		
		System.out.println(myCoach.getDailyTips());
		System.out.println(myCoach.getDailyfortunes());
		
		context.close();
	}

}
