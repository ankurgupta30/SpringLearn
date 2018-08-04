import com.test.ankur.service.MyService;
import com.test.ankur.service.MyServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		MyService myService = new MyServiceImpl();
		System.out.println("People : "+  myService.findPeople());

	}

}
