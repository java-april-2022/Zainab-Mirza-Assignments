package com.zainab.travel.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zainab.travel.models.Expense;
import com.zainab.travel.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo; 
	}
	
	
	// returns all expenses 
	public List<Expense> allExpenses() {
		return expenseRepo.findAll(); 
	}
	
	
	public void createExpense(Expense expense) {
		expenseRepo.save(expense); 
	}
	
}
