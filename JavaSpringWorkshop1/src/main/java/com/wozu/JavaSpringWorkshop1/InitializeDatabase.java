package com.wozu.JavaSpringWorkshop1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.wozu.JavaSpringWorkshop1.models.*;
import com.wozu.JavaSpringWorkshop1.repositories.*;

@Component
public class InitializeDatabase {
	private BookRepository bookRepo;
	private PersonRepository personRepo;

	@Autowired
	public InitializeDatabase(BookRepository bookRepo, PersonRepository personRepo) {
		this.bookRepo = bookRepo;
		this.personRepo = personRepo;
		LoadPeople();
		LoadBooks();
	}

	public void LoadPeople() {
		if (personRepo.count() == 0) {
			Person newPerson = new Person();
			newPerson.setFirstName("Francis Scott");
			newPerson.setMiddleName("Key");
			newPerson.setLastName("Fitzgerald");
			personRepo.save(newPerson);
		}
	}

	public void LoadBooks() {
		if (bookRepo.count() == 0) {
			Book newBook = new Book();
			newBook.setTitle("The Great Gatsby");
			bookRepo.save(newBook);
		}
	}
}
