package com.wozu.JavaSpringWorkshop1.repositories;
import com.wozu.JavaSpringWorkshop1.models.*;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
}
