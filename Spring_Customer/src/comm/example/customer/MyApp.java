package comm.example.customer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("propertiesContext.xml");
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		Human human = context.getBean("customer" , Human.class);
		
		System.out.println(human.getDetails());
		
		context.close();

	}

}
