import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.ankur.dao.MyRepository;
import com.test.ankur.service.MyService;
import com.test.ankur.service.MyServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = applicationContext.getBean("myService", MyService.class);
		System.out.println("People : "+  myService.findPeople());

	}

}
