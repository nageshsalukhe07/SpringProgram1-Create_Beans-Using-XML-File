package in.ns.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ns.beans.Student;

//spring-beans
		//spring-core
		//spring-context
		//common-logging
		//spring-expression
		
public class Main {

	public static void main(String[] args) {
		
		//Using XML configuration file
		
		String cfg="in/ns/resources/applicationContext.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
		
		Student std = (Student) context.getBean("stdId");
		
		std.display();
		
		
	}

}
