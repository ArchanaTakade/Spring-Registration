package com.spring.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.Model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	 Optional<User>findByusername(String fname);

//	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

//	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
	

}
