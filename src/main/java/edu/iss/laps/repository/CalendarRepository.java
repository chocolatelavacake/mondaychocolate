package edu.iss.laps.repository;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Integer>{
	
	@Query("SELECT c FROM Calendar c")
	ArrayList<Calendar> findCalendars();
}