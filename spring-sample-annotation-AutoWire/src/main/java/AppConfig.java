import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.test.ankur"})
public class AppConfig {

	/*@Bean(name="myRepository")
	public MyRepository getMyRepository() {
		return new MyRepositoryImpl();
	}
	*/
/*	@Bean
	public MyRepository myRepository() {
		return new MyRepositoryImpl();
	}
	
	@Bean
	public MyService myService(MyRepository myRepository) {
		MyServiceImpl myService =  new MyServiceImpl();
		myService.setMyRepository(myRepository);
		return myService;
		
	}
*/	
}
