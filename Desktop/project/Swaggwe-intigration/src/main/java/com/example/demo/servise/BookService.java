package com.example.demo.servise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookRepo;
import com.example.demo.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepo repositary;
	
	public String saveBook(Book book) {
		repositary.save(book);
		return "book save with id" + book.getClass();
		
	}
	
	public Optional<Book> getBook(int bookId) {
		return repositary.findById(bookId);
	}
	
	public List<Book> removeBook(int bookId){
		repositary.deleteById(bookId);
		return repositary.findAll();
		
	}
	
}
