package com.example.demoazure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class WebController {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(value = "/welcomepost/{id}", method = RequestMethod.GET)
	  public ResponseEntity<String> welcomepost(@PathVariable int id) {
	    return new ResponseEntity<String>("okk",HttpStatus.OK);
	  }
	@RequestMapping(value = "/postid", method = RequestMethod.POST)
	  public ResponseEntity<String> createStudent(@RequestBody String ten) {
	    return new ResponseEntity<String>("okokok",HttpStatus.OK);
	  }
}
