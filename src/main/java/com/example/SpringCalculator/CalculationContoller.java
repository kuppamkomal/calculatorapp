package com.example.SpringCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationContoller {
	
	@Autowired
	CalcOps cao;
	@RequestMapping("/")
	public String sendHomePage() {
		return "home";
	}
	
	@PostMapping("/calculate")
	public String getResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("operation") String operation, Model model) {
		int result = cao.getResult(num1,num2, operation);
		model.addAttribute("n1", num1);
		model.addAttribute("n2", num2);
		model.addAttribute("res", result);
		return "result";
	}
}
