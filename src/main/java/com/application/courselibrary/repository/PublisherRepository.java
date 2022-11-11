package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zoetian
 * @create 2022/11/11
 */
public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
