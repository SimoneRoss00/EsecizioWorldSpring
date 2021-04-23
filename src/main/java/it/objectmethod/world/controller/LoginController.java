package it.objectmethod.world.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String viewCityByame(@RequestParam("sessionName")String userName,ModelMap map, HttpSession session) {
		session.setAttribute("loginSession", userName);
		return "printallcontinent";
	}

	@GetMapping("/login")
	public String viewCity() {
		return "sessionlogin";
	}

}
