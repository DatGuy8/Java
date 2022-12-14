package com.johntran.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.johntran.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
}
