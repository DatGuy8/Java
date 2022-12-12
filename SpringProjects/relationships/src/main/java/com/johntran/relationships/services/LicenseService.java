package com.johntran.relationships.services;

import org.springframework.stereotype.Service;

import com.johntran.relationships.models.License;
import com.johntran.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {

	private final LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public License addLicense(License license) {
		return licenseRepo.save(license);
	}
	
}
