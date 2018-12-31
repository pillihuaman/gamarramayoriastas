package common.System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//@GetMapping("/hello")
	//public String hello(Model model) {

		//model.addAttribute("name", "John Doe");
		

		//return "welcome";
	//}
	  @RequestMapping("/hello")  
	    public String helloWorld(Model m) {  
	        String message = "Hello World, Spring MVC @ Javatpoint";  
	        m.addAttribute("message", message);  
	        return "hello";   

}
	  }