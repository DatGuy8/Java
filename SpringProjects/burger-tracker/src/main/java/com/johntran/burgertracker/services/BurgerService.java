package com.johntran.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.johntran.burgertracker.models.Burger;
import com.johntran.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository repo;
	
	public BurgerService(BurgerRepository repo) {
		this.repo = repo;
	}

//============returns all burgers================
	public List<Burger> allBurgers(){
		return repo.findAll();
	}
	
//============create a burger=====================
	public Burger createBurger(Burger burger) {
		return repo.save(burger);
	}
	
//=============Retrieve a burger========================	
	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = repo.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}
		else {
			return null;
		}
	}
	
//============Update burger===================
	public Burger updateBurger(Burger burger) {
		return repo.save(burger);
	}
	
//============Delete Burger====================
	public void deleteBurger(Long id) {
		repo.deleteById(id);
	}
}
