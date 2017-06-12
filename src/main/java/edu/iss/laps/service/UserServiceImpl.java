package edu.iss.laps.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.model.User;
import edu.iss.laps.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserRepository userRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<User> findUserIDs() {
		ArrayList<User> uil = (ArrayList<User>) userRepository.findUsers();
		return uil;
	}


	@Override
	@Transactional
	public ArrayList<String> findEmails() {
		ArrayList<String> el = (ArrayList<String>) userRepository.findEmails();
		return el;
	}
}
