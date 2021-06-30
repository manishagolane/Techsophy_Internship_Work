package com.example.crud.contorller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Book;
import com.example.crud.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository  bookRepository;
	
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Your record is saved successfully!!!!";
	}
	
	@PostMapping("/multipleBookSave")
	public String insertBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);
		return "Recorded all data successfully!!!!";
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getBook() {
		return (List<Book>) bookRepository.findAll();
	}
	
	@GetMapping("/getBookByName/{name}")
	public List<Book> getBook(@PathVariable("name") String bookName) {
		return (List<Book>)bookRepository.findBybookName(bookName);
	}
	
	@GetMapping("/getBookById/{bookId}")
	public Optional<Book> getBook(@PathVariable("bookId") Long id) {
		return bookRepository.findById(id);
	}


}
