package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Primeiro {
	@GetMapping("/")
	public String ini() {
		return "index";
	}

}
