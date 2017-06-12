package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.iss.laps.model.Approval;

public interface ApprovalRepository extends JpaRepository<Approval,Integer>{
	
	@Query("SELECT a FROM Approval a")
	ArrayList<Approval> findApprovals();

}