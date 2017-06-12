package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.repository.StaffLeaveAllocationRepository;

@Service
public class StaffLeaveAllocationServiceImpl implements StaffLeaveAllocationService {
	
	@Resource
	private StaffLeaveAllocationRepository staffLeaveAllocationRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Staffleaveallocation> findSLAs() {
		ArrayList<Staffleaveallocation> slal = (ArrayList<Staffleaveallocation>) staffLeaveAllocationRepository.findSLAs();
		return slal;
	}
}
