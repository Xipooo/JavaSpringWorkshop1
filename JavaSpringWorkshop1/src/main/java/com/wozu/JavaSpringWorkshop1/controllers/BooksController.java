package com.wozu.JavaSpringWorkshop1.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.wozu.JavaSpringWorkshop1.models.Book;
import com.wozu.JavaSpringWorkshop1.repositories.BookRepository;
import com.wozu.JavaSpringWorkshop1.viewmodels.BookAuthor;

@RestController
@RequestMapping("/api")
public class BooksController {
	
	private BookRepository repo;
	
	@Autowired
	public BooksController(BookRepository repo) {
		this.repo = repo;
	}
	
	@RequestMapping("/getAuthors")
	public List<BookAuthor> GetAuthors(){
		List<Book> books = Lists.newArrayList(repo.findAll());
		List<BookAuthor> authorNames = 
				books.stream().map(
					b -> new BookAuthor(
							b.getAuthor().getFirstName(),
							b.getAuthor().getMiddleName(),
							b.getAuthor().getLastName()
					))
				.collect(Collectors.toList());
		return authorNames;
	}
}
