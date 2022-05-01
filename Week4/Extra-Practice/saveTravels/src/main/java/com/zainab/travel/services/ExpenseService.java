package com.zainab.travel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zainab.travel.models.Expense;
import com.zainab.travel.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	// this adds the expense repository as a dependency 
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo; 
	}
	
	
	// returns all expenses 
	public List<Expense> allExpenses() {
		return expenseRepo.findAll(); 
	}
	
	// for adding a new item
	public void createExpense(Expense expense) {
		expenseRepo.save(expense); 
	}
	
	
	// for edits; gets a book by its ID 
	 public Expense findExpense(Long id) {
	        Optional<Expense> optionalExpense = expenseRepo.findById(id);
	        if(optionalExpense.isPresent()) {
	            return optionalExpense.get();
	        } else {
	            return null;
	        }
	    }


	public void updateExpense(Expense expense) {
		expenseRepo.save(expense); 
		
	}


	public void delete(Long id) {
		expenseRepo.deleteById(id);
		
	}
	 
	
}
