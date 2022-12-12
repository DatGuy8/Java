package com.johntran.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.johntran.relationships.models.Person;
import com.johntran.relationships.repositories.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}

//================Gets ALL======================	
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
//==============Create One=======================
	public Person addPerson(Person person) {
		return personRepo.save(person);
	}

	public Person findPerson(Long person_id) {
		Optional<Person> optionalPerson = personRepo.findById(person_id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		}else {
			return null;
			}
	}

}
