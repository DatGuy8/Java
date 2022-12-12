package com.johntran.savetravels.controllers;

import java.math.BigDecimal;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.johntran.savetravels.models.Expense;
import com.johntran.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseRepo;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}

//===========Dashboard with add from=============	
	@GetMapping("/expenses")
	public String homePage(
			Model model,
			@ModelAttribute("expense") Expense expense
			) {
		List<Expense> expenses = expenseRepo.allExpenses();
		model.addAttribute("expenses", expenses);
		
		BigDecimal total = expenseRepo.getExpenseTotal();
		model.addAttribute("totalExpenses", total);
		return "expensesPage.jsp";
	}
	
//===========POST FORM TO ADD EXPENSE=============	
	@PostMapping("/expenses")
	public String addExpense(
			Model model,
			@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result
			) {
		
		if(result.hasErrors()) {
			List<Expense> expenses = expenseRepo.allExpenses();
			model.addAttribute("expenses", expenses);
			return "expensesPage.jsp";
		}
		else {
			expenseRepo.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
//===============EDIT PAGE TO UPDATE EXPENSE==================
	@GetMapping("/expenses/edit/{id}")
	public String editForm(
			@PathVariable("id")Long id, 
			Model model
			) {
		Expense expense = expenseRepo.findExpense(id);
		model.addAttribute(expense);
		return "editExpense.jsp";
	}
	
//===============EDIT PAGE POST ROUTE/UPDATE================
	@PutMapping("/expenses/{id}")
	public String updateExpense(
			@Valid @ModelAttribute("expense")Expense expense,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "editExpense.jsp";
		}
		else {
			expenseRepo.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
//================Delete Expense========================
	@DeleteMapping("/expenses/delete/{id}")
	public String deleteExpense(
			@PathVariable("id")Long id
			) {
		expenseRepo.deleteExpense(id);
		return "redirect:/expenses";
	}
	
//==============Show Expense Page========================
	@GetMapping("/expenses/{id}")
	public String showExpense(
			@PathVariable("id")Long id,
			Model model
			) {
		Expense expense = expenseRepo.findExpense(id);
		model.addAttribute(expense);
		return "showExpense.jsp";
		
	}
	
	
	
}
