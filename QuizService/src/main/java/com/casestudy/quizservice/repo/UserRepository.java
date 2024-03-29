package com.casestudy.quizservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.quizservice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = :username and u.password = :password")
	Optional<User> findByUsernameAndPassword(String username, String password);
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	Optional<User> findByUsername(String username);

}