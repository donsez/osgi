package hello.server;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;

@Component
@Instantiate
public class HelloComponent implements hello.service.HelloService {

	public HelloComponent() {
		System.out.println("Hello hello_server");
	}

        public String sayHello(String name) {
                return "Hello" + name + " !";
        }
	
}
