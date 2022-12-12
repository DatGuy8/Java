package com.johntran.savetravels.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.johntran.savetravels.models.Expense;
import com.johntran.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	
//================Gets All Expenses=====================
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}

//=================Create a Expense=====================
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
//===============Retrive a Expense======================
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	
//============Update An Expense=======================
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
//============Delete Expense===========================
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	
//============Get All Expenses total====================
	public BigDecimal getExpenseTotal() {
		
		Double total = (double) 0;
		for(Expense expense: this.allExpenses()) {
			total += expense.getAmount();
		}
		BigDecimal totalAmount = new BigDecimal(total).setScale(2,RoundingMode.HALF_DOWN);
		System.out.println(totalAmount);
		return totalAmount;
	}
	
}
