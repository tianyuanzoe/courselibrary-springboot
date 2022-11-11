package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zoetian
 * @create 2022/11/11
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
