package ap.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import ap.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	//@Qualifier("greetingServiceImpl")
	// naming variable name like class name Spring resolve and Inject the right dependency
	// BUT @Qualifier is bettetr !!!! do not use name reflection
	public GreetingService greetingServiceImpl; 

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
    
}
