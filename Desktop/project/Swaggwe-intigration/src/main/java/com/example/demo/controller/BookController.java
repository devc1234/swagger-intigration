package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.servise.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bookservise")
public class BookController {

	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping("/serachbook/{bookId}")
	public Optional<Book> getBookId( @PathVariable int bookId) {
		return service.getBook(bookId);
	}
	
	@DeleteMapping("/delectbook/{bookId}")
	public List<Book> delectBook(int  bookId){
		return service.removeBook(bookId);
	}
	
}
