package com.application.courselibrary.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;


/**
 * @author zoetian
 * @create 2022/11/10
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 100,nullable = false,unique = true)
    private String name;
    @Column(name = "description",length = 250,nullable = false)
    private String description;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();
}
