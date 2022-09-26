package com.subbu.subbupamapna.demo.jpainheritancemapping;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.subbupamapna.demo.courcesproject.Course;


@RestController
public class InheritanceRESTController {

	@Autowired
	EmployeeRepo repository;
	
	
	@GetMapping("/inhe/pemp/all")
	public List<Employee>  all() {
		return repository.getAll();
	}
	
	
	@GetMapping("/inhe/pemp/id")
	public Employee get(@RequestParam("id") Long id ) {
		return repository.findByID(id);
	}
	
	
	@PostMapping("/inhe/pemp/add")
	public void insert(@RequestParam("name") String name ) {
		 repository.insert(new PartTimeEmployee(name, new BigDecimal(1000)));
	}
	
	
	
	

	
	
	
    
}
