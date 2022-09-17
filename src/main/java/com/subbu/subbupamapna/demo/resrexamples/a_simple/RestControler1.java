package com.subbu.subbupamapna.demo.resrexamples.a_simple;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public String getWithQueryParms(@RequestParam("data") String msg) {
		return "You sent Data ="+msg;
	}
	
	@GetMapping("/queryparam2")
	public String getWithQueryParms2(@RequestParam("data") String msg,@RequestParam("data2") String data2) {
		return "You sent Data = 1"+msg+ " 2 ="+data2;
	}
	
	@PostMapping("/newemployee")
	 public String newEmployeeDetails(@RequestBody Employee newEmployee) {
	    return "Data of " +newEmployee.name+ " is saved ";
	 }
	
	
	@PostMapping("/newemployeeAndQuery")
	 public String newEmployeeDetailsWithQuery(@RequestBody Employee newEmployee,@RequestParam("data") String data) {
	    return "Data of " +newEmployee.name+ " is saved  to " +data;
	 }

	
	@PutMapping("/putrecord")
	 public String putExample() {
	    return "Put Succesful";
	 }


	@RequestMapping(value="user", method = RequestMethod.GET)
	public String getUserBalance(@RequestParam("userId") String userID) {
		return "For user ID ="+userID+" balance is 100";
	}
	

}
