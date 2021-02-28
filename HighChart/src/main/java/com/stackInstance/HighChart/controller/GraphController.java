package com.stackInstance.HighChart.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {
	
	@GetMapping("/barChart")
	public String barChart(Model model)
	{
		Map<String, Integer> data = new LinkedHashMap<String, Integer>();
		data.put("Ashish", 30);
		data.put("Ankit", 50);
		data.put("Gurpreet", 70);
		data.put("Mohit", 90);
		data.put("Manish", 25);
		model.addAttribute("keySet", data.keySet());
		model.addAttribute("values", data.values());
		return "barChart";
		
	}
	
	@GetMapping("/pieChart")
	public String pieChart(Model model) {
		model.addAttribute("pass", 90);
		model.addAttribute("fail", 10);
		return "pieChart";
		
	}
	
	
	

}
