package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Leaverecord;
import edu.iss.laps.repository.LeaveRecordRepository;

@Service
public class LeaveRecordServiceImpl implements LeaveRecordService {
	
	@Resource
	private LeaveRecordRepository leaveRecordRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Leaverecord> findLeaveRecords() {
		ArrayList<Leaverecord> uil = (ArrayList<Leaverecord>) leaveRecordRepository.findLeaveRecords();
		return uil;
	}
	
	@Transactional
	public Leaverecord CreateLeave(Leaverecord leaveR) {
		// TODO Auto-generated method stub
	 return leaveRecordRepository.saveAndFlush(leaveR);
	}
}
