package com.subbu.subbupamapna.demo.resrexamples.a_simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping()
public class SimpleControllerAndRequestMaping {
	
	@GetMapping(value="/",produces = "application/json")
	    public @ResponseBody String getBook() {
	        return "Hello World!!!";
	    } 
}


