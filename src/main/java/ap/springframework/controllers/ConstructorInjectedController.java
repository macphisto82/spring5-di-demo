package ap.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ap.springframework.services.GreetingService;

@Component
public class ConstructorInjectedController {

	private GreetingService greetingService;

	@Autowired // Spring does it 4 me automatically, but for more readability code I prefer to specify it (not needed but more comprensive)
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
