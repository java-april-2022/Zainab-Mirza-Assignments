package com.zainab.travel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zainab.travel.models.Expense;
import com.zainab.travel.services.ExpenseService;

@Controller
public class MainController {
	
	@Autowired
	ExpenseService expenseService;
	
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses); 
		return "new.jsp"; 
	}
	
	
	@PostMapping("/expenses")
	public String index(
			@Valid @ModelAttribute("expense") Expense expense, 
			BindingResult results, Model model) {
		
		if(results.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "new.jsp";
		}
		
		else {
		
		expenseService.createExpense(expense); 
		return "redirect:/expenses"; 
	}
		
		
	}

}

