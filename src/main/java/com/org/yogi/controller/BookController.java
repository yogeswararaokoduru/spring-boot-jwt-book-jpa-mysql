package com.org.yogi.controller;

import com.org.yogi.dao.BookDao;
import com.org.yogi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/book"})
public class BookController {
/*
* create by yogi
* */
    @Autowired
    private BookDao bookDao;

    @PostMapping("/createbook")
    public void createBook(@RequestBody Book book) {
        bookDao.save(book);
    }

    @DeleteMapping("/delete/{title}")
    public void deleteByTitle(@PathVariable String title) {
        bookDao.deleteByTitle(title);
    }

    @DeleteMapping("/createbook/{isbn}")
    public void deleteByIsbn(@PathVariable String isbn) {
        bookDao.deleteByIsbn(isbn);
    }

	@GetMapping("/getbyisbn/{isbn}")
	public Book findByIsbn(@PathVariable String isbn) {
	return 	bookDao.findByIsbn(isbn);
	}
	@GetMapping("/getbytitle/{title}")
	public Book findByTitle(@PathVariable String title) {
		return 	bookDao.findByTitle(title);
	}
	@GetMapping("/getbyauthor/{author}")
	public Book findByAuthor(@PathVariable String author) {
		return 	bookDao.findByAuthor(author);
	}

}