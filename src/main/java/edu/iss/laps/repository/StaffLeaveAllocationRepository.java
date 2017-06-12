package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Staffleaveallocation;

public interface StaffLeaveAllocationRepository extends JpaRepository<Staffleaveallocation, Integer>{
	
	@Query("SELECT sla FROM Staffleaveallocation sla")
	ArrayList<Staffleaveallocation> findSLAs();
}