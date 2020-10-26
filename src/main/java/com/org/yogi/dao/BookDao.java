package com.org.yogi.dao;

import com.org.yogi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    /*
     * find by title, isbn and author
     *
     * */
    Book findByTitle(String title);

    Book findByAuthor(String author);

    Book findByIsbn(String isbn);

    /*
    deleting by title and isbn

    */
    void deleteByTitle(String title);

    void deleteByIsbn(String isbn);
}
