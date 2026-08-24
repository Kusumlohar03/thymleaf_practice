package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside the about method.....");
		model.addAttribute("name", "Kusum");
		model.addAttribute("date", new Date().toLocaleString());
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iteraterHandler(Model m) {
		List<String> names = List.of("kusum","tara","mansi","srushti","prachi");
		m.addAttribute("names",names);
		return "iterater";
	}
	
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("checking conditions");
		m.addAttribute("isActive",true);
		m.addAttribute("gender","M");
		List<Integer> list = List.of();
		m.addAttribute("mylist",list);
		return "condition";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title","hello");
		m.addAttribute("substitle","world");
		return "service";
	}
	
	@GetMapping("/about1")
	public String aboutHandler() {
		return  "about1";
	}
}
