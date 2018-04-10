package com.wozu.JavaSpringWorkshop1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wozu.JavaSpringWorkshop1.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
