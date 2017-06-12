package edu.iss.laps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("SELECT u FROM User u")
	ArrayList<User> findUsers();
	
	@Query("SELECT u.emailUsr FROM User u")
	ArrayList<String> findEmails();
}
