package com.application.courselibrary.service;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.AbstractUriTemplateHandler;

import java.util.List;

/**
 * @author zoetian
 * @create 2022/11/10
 */
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> findAllAuthors(){
        return authorRepository.findAll();
    }
    public Author findAuthorById(Long id){
        Author author = authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
        return author;
    }
    public void createAuthor(Author author){
        authorRepository.save(author);
    }
    public void deleteAuthor(Long id){
        Author author = authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
        authorRepository.deleteById(author.getId());

    }
}
