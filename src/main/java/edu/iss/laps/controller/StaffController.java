package edu.iss.laps.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.iss.laps.model.Leaverecord;
import edu.iss.laps.service.LeaveRecordService;

@Controller
@RequestMapping(value = "/staff")
public class StaffController {
    @Autowired
    private LeaveRecordService lService;
    
    @RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home/login";
	}
    
    @RequestMapping(value = "/leave/create", method = RequestMethod.GET)
	public ModelAndView newLeavePage() {
		ModelAndView mav = new ModelAndView("staff-leave-new");
		mav.addObject("leaverecord", new Leaverecord());
		return mav;
    }
    @RequestMapping(value = "/leave/create", method = RequestMethod.POST)
	public ModelAndView createNewLeave(@ModelAttribute @Valid Leaverecord leaveR, BindingResult result,
			final RedirectAttributes redirectAttributes, HttpSession session) {

		if (result.hasErrors())
			return new ModelAndView("staff-leave-new");

		ModelAndView mav = new ModelAndView();
		//String message = "New leave " + leaveR.getLeaveidLrd() + " was successfully created.";
	   /* UserSession us=(UserSession)  session.getAttribute("USERSESSION");
	    leaveRPK.setUidLrd(us.getUser().getUidUsr());*/
		//leaveR.getUidLrd();
	    leaveR.setLeavestatusLrd(leaveR.SUBMITTED);
	    mav.setViewName("redirect:/staff/history");
	    lService.CreateLeave(leaveR);
        return mav;
	}
}
