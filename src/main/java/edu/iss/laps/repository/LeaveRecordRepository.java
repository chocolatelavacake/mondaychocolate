package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import edu.iss.laps.model.Leaverecord;

public interface LeaveRecordRepository extends JpaRepository<Leaverecord, Integer>{
	
	@Query("SELECT lr FROM Leaverecord lr")
	ArrayList<Leaverecord> findLeaveRecords();
}