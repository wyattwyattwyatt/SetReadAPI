package SetReadAPI.SetReadAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("WebControllers")
public class SetReadApiApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SetReadApiApplication.class, args);
	}
}
