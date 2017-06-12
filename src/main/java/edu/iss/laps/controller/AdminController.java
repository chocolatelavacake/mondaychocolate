package edu.iss.laps.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.model.User;
import edu.iss.laps.service.UserService;
import edu.iss.laps.model.Staffleaveallocation;
import edu.iss.laps.service.StaffLeaveAllocationService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@Autowired
	private UserService uService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@RequestMapping(value = "/mle")
//	public ModelAndView manageLeaveEntitlement(@RequestParam("year") String year,
//			@RequestParam("category") String category) {
////		HashMap<Employee, ArrayList<Course>> hm = new HashMap<Employee, ArrayList<Course>>();
////		UserSession us = (UserSession) session.getAttribute("USERSESSION");
////		System.out.println(us.toString());
////		ModelAndView mav = new ModelAndView("login");
////		if (us.getSessionId() != null) {
////			for (Employee employee : us.getSubordinates()) {
////				ArrayList<Course> clist = cService.findPendingCoursesByEID(employee.getEmployeeId());
////				hm.put(employee, clist);
////			}
////			mav = new ModelAndView("manager-pending-course-history");
////			mav.addObject("pendinghistory", hm);
////			return mav;
////		}
////		return mav;
//		ModelAndView mav = new ModelAndView("manage-leave-entitlement");
//		
//		mav.addObject("year", Integer.parseInt(year));
//		mav.addObject("category", category);
//		
////		ArrayList<User> userList = uService.findUserIDs();
////		mav.addObject("userList" ,userList);
//		
//		
//		return mav;
//		
//	}
//	
	
	@RequestMapping(value = "/mle")
	public ModelAndView manageLeaveEntitlement(HttpServletRequest request) {
//		HashMap<Employee, ArrayList<Course>> hm = new HashMap<Employee, ArrayList<Course>>();
//		UserSession us = (UserSession) session.getAttribute("USERSESSION");
//		System.out.println(us.toString());
//		ModelAndView mav = new ModelAndView("login");
//		if (us.getSessionId() != null) {
//			for (Employee employee : us.getSubordinates()) {
//				ArrayList<Course> clist = cService.findPendingCoursesByEID(employee.getEmployeeId());
//				hm.put(employee, clist);
//			}
//			mav = new ModelAndView("manager-pending-course-history");
//			mav.addObject("pendinghistory", hm);
//			return mav;
//		}
//		return mav;
//		
//		String category = request.getParameter("category");
//		if (category == null)
//		{
//			category = "IT WAS NULL";
//		}
		
		ModelAndView mav = new ModelAndView("manage-leave-entitlement");
//		
//		mav.addObject("year", 123);
//		mav.addObject("category", category);
		
//		ArrayList<User> userList = uService.findUserIDs();
//		mav.addObject("userList" ,userList);
		
		// NOTHING HERE GUYS.
		
		return mav;
		
	}
	
	
}
