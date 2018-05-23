package WebControllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ReadSetResource {
	
	@RequestMapping("/")
	public String home() {
		return "Base Read API for Sets API";
	}
	

}
