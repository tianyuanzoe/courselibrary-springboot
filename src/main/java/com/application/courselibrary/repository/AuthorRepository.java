package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zoetian
 * @create 2022/11/10
 */
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
