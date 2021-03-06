package com.qa.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.domain.Book;
import com.qa.main.service.BookService;

@RestController
@RequestMapping("/library")
public class BookController {

	private BookService service;
	
	public BookController(BookService service) {
		super();
		this.service = service;
	}

	//http://localhost:9003/library/	
	
	//CREATE
	@PostMapping("/createBook")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return new ResponseEntity<Book>(this.service.createBook(book), HttpStatus.CREATED);
	}
	
	
	//READALL
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks(){
		return new ResponseEntity<List<Book>>(this.service.getAllBooks(), HttpStatus.OK);
	}
	
	//READ
	@GetMapping("/getBook/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Long id) {
		return new ResponseEntity<Book>(this.service.getBook(id), HttpStatus.OK);
	}
	
	//UPDATE
	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book updatedBook) {
		return new ResponseEntity<Book>(this.service.updateBook(id, updatedBook), HttpStatus.ACCEPTED);
	}

	//DELETE
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<Boolean> deleteBook(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.deleteBook(id), HttpStatus.OK);
	}
}
