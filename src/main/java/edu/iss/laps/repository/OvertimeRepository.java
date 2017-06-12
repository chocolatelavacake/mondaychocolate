package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Overtime;

public interface OvertimeRepository extends JpaRepository<Overtime, Integer>{
	
	@Query("SELECT o FROM Overtime o")
	ArrayList<Overtime> findOvertimes();
}