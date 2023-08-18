package com.mattmottle.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {
				Integer counted = (Integer)session.getAttribute("count");
				counted = counted + 1;
				session.setAttribute("count", counted);
			}
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.getAttribute("count");
		return "counter.jsp";
	}
	
	@RequestMapping("/doublecounter")
	public String doubleCounter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {
				Integer counted = (Integer)session.getAttribute("count");
				counted = counted + 2;
				session.setAttribute("count", counted);
			}
		return "doubleCounter.jsp";
		
	}
	
}
