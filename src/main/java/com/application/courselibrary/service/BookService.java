package com.application.courselibrary.service;

import com.application.courselibrary.entity.Book;
import com.application.courselibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zoetian
 * @create 2022/11/10
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findAllBooks(){
     return bookRepository.findAll();
    }
    public Book findBookById(Long id){
        Book book = bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book NOT FOUND"));
        return book;
    }
    public void createBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        Book book = bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book NOT FOUND"));
        bookRepository.deleteById(book.getId());

    }

}
