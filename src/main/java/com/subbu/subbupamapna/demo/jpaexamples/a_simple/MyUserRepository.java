package com.subbu.subbupamapna.demo.jpaexamples.a_simple;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface MyUserRepository extends JpaRepository < UserEntity, Long > {
    UserEntity findByEmail(String email);
    
}
