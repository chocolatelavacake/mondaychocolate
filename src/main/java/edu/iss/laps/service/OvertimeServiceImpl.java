package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Overtime;
import edu.iss.laps.repository.OvertimeRepository;

@Service
public class OvertimeServiceImpl implements OvertimeService {
	
	@Resource
	private OvertimeRepository overtimeRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Overtime> findOvertimes() {
		ArrayList<Overtime> ol = (ArrayList<Overtime>) overtimeRepository.findOvertimes();
		return ol;
	}
}
