package lt.aurimas.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import lt.aurimas.model.Student;
import lt.aurimas.model.StudentLogin;
import lt.aurimas.service.StudentService;

@Controller
public class HomeController {
	
	private static final Logger log = Logger.getLogger(HomeController.class);
		
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
		log.info("Here");
		return "homePage";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {		
		return "index";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {			
		StudentLogin studentLogin = new StudentLogin();		
		model.addAttribute("studentLogin", studentLogin);
		return "template";
	}
}
