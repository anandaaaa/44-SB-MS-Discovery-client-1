package in.anand.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anand.client.GreetClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetClient greetclient;
	
	@GetMapping("/welcome")
	public String getWelcome()
	{
	String msg= "Welcome to the world";
	String greet = greetclient.greetCon();
	
	return greet+""+msg;
	}

}
