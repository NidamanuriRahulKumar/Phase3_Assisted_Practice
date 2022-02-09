package spring.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.HelloWorld;

@Controller
public class HelloWorldController {

	
	@RequestMapping ("/helloworld")
	public String handler(Model model) {
		HelloWorld helloworld = new HelloWorld();
		helloworld.setMessage("Hello World Spring MVC Example...");
		helloworld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloworld", helloworld);
		return "helloworld";
	}
}
