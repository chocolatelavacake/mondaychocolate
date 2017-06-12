package edu.iss.laps.service;

import java.util.ArrayList;
import java.util.List;

import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.model.User;

public interface UserService {

	ArrayList<User> findUserIDs();

	ArrayList<String> findEmails();
}