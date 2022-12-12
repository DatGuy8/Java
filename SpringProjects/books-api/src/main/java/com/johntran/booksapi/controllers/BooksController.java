package com.johntran.booksapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.johntran.booksapi.models.Book;
import com.johntran.booksapi.services.BookService;

@Controller
public class BooksController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/book/{bookId}")
	public String index(@PathVariable("bookId")Long bookId, Model model) {
		
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		System.out.println(book);
		
		model.addAttribute("book", book);
		
		return "show.jsp";
	}
	
	@GetMapping("/books")
	public String allBooks(Model model) {
		
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "allBooks.jsp";
	}
	
	@GetMapping("/books/new")
	public String bookForm(@ModelAttribute("book") Book book
			) {
		return "newBook.jsp";
	}
	
	@PostMapping("/books")
	public String addBook(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result
		) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		}
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	@RequestMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
    
    @DeleteMapping("/books/{id}")
    public String destory(@PathVariable("id")Long id) {
    	bookService.deleteBook(id);
    	return "redirect:/books";
    }
	
}
