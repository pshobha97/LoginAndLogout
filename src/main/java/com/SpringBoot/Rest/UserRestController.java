package com.SpringBoot.Rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import com.SpringBoot.Entity.User;
import com.SpringBoot.Service.UserService;

@Controller
public class UserRestController {
	
	@Autowired
	private UserService userService;
	@RequestMapping({"/"})
	
	public String showForm(Model model,HttpSession httpSession) {
		model.addAttribute("user",new User());
		httpSession.setAttribute("message", "Hi!.........");
		

		
		return "login";
		
	}
	@RequestMapping("/userLogin")
	public String login(@ModelAttribute("user") User user, HttpSession httpSession) throws IOException {
		
		String userName=user.getUserName();
		String password=user.getUserPassword();
		User fetchedUser=userService.login(userName, password);
		if(fetchedUser==null) {
			httpSession.setAttribute("message", "Invalid Details! Try with another one.");
			return "redirect:/";
		}
		httpSession.setAttribute("users", fetchedUser);
		httpSession.setAttribute("message", "Welcome to home "+user.getUserName());
		
		
		return "home";
		
	}
	@RequestMapping("/logout")
	public String logout(Model model,HttpSession httpSession){
		httpSession.removeAttribute("users");
		httpSession.setAttribute("message", "Logged out successfully!......");
		model.addAttribute("user",new User());
		return "redirect:/";
		
	}
//	@RequestMapping("/error")
//	public String errorpage(){
//		return "error";
//		
//	}
//	

}
