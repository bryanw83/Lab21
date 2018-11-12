package com.Lab21.Lab21;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CoffeeShopController {
	
	@Autowired
	private Person p;
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index", "firstPage", "");
		return mv;
		
	}
	
	@RequestMapping("/registry")
		public ModelAndView regPage() {
		return new ModelAndView("registry");
	}
	
	@RequestMapping("/summary")
	public ModelAndView sumPage() {
		return new ModelAndView("summary");
	}
	
	@RequestMapping("/userSum")
	public ModelAndView listpeeps(@RequestParam("firstName") String fname, @RequestParam("lastName") String lname, 	@RequestParam("age") String age, @RequestParam("address") String address,
			@RequestParam("email") String userEmail, @RequestParam("phoneNum") String userPhone, @RequestParam("password") String userPass)
		
	{
		ArrayList<Person> peeps = new ArrayList<>();
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setAge(age);
		p.setAddress(address);
		p.setEmail(userEmail);
		p.setPhoneNum(userPhone);
		p.setPassword(userPass);;
		peeps.add(p);
		return new ModelAndView("summary", "peeplist", peeps);
	}
	
	@RequestMapping("/radioButton")
	public ModelAndView radioEx(@RequestParam("choice") String choice) {
		return new ModelAndView("summary", "userData", choice);
	}
	

}
