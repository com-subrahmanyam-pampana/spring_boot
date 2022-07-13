package com.subbu.subbupamapna.demo.repositoryexample;



public interface DemoRepository<T> {
	  
    // Save method
    public void save(T t);
  
    // Find a student by its id
    public T findStudentById(Long id);
  
}