package com.avellino.avelinowebportal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.avellino.avelinowebportal.model.Clinic;

//@RepositoryRestResource() if needed
@Repository
public interface ClinicRepository extends MongoRepository<Clinic, String>{
	@Query(value="{}")
	List<Clinic> getAllClinics();
}
