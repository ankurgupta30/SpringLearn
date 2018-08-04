import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.ankur.dao.MyRepository;
import com.test.ankur.dao.MyRepositoryImpl;
import com.test.ankur.service.MyService;
import com.test.ankur.service.MyServiceImpl;

@Configuration
public class AppConfig {

	/*@Bean(name="myRepository")
	public MyRepository getMyRepository() {
		return new MyRepositoryImpl();
	}
	*/
	@Bean
	public MyRepository myRepository() {
		return new MyRepositoryImpl();
	}
	
	@Bean
	public MyService myService(MyRepository myRepository) {
		MyServiceImpl myService =  new MyServiceImpl();
		myService.setMyRepository(myRepository);
		return myService;
		
	}
	
}
