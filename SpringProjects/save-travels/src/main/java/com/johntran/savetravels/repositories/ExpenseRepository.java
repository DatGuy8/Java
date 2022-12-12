package com.johntran.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.johntran.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long>{
	
	List<Expense> findAll();

}
