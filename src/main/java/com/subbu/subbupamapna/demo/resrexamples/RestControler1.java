package com.subbu.subbupamapna.demo.resrexamples;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler1 {
	
	@GetMapping("/")
	public String greeting() {
		return "Hello World";
	}
	
	@GetMapping("/queryparam")
	public String getWithQueryParms(@RequestParam("data") String data) {
		return "You sent Data ="+data;
	}
	
	@RequestMapping(value="user", method = RequestMethod.GET)
	public String getUserBalance(@RequestParam("userId") String userID) {
		return "For user ID ="+userID+" balance is 100";
	}
	
	 @PostMapping("/newemployee")
	  public String newEmployeeDetails(@RequestBody Employee newEmployee) {
	    return "Data of " +newEmployee.name+ " is saved ";
	  }
	
	

}
