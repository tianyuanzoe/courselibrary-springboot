package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zoetian
 * @create 2022/11/10
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
