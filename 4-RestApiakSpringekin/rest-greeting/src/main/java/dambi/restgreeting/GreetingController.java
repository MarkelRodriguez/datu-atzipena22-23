package dambi.restgreeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static String template;
	private final AtomicLong counter = new AtomicLong();

	/*@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}*/
   
    @GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name,@RequestParam(value = "language", defaultValue = "World") String language) {
        if (language == "es"){
            template = "Hola, %s!";
        }
        else if(language == "eu"){
            template = "Kaixo, %s!";
        }
        else{
            template = "Hello, %s!";
        }
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
