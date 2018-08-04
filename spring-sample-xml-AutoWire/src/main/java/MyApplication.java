import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.ankur.service.MyService;

public class MyApplication {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-resources.xml");
		MyService myService = applicationContext.getBean("myService", MyService.class);
		System.out.println("People : "+  myService.findPeople());

	}

}
