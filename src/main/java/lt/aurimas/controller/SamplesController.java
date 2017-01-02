package lt.aurimas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SamplesController {

	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value="/samples", method=RequestMethod.GET)
	public String home(Model model) {
		log.info("Here sampless");
		return "samples";
	}
	
}
