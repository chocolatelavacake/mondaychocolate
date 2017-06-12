package edu.iss.laps.service;

import java.util.ArrayList;

import edu.iss.laps.model.Leaverecord;

public interface LeaveRecordService {

	ArrayList<Leaverecord> findLeaveRecords();
	
	Leaverecord CreateLeave(Leaverecord leaveR);

}