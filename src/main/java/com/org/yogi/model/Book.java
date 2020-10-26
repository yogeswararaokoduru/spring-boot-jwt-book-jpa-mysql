package com.org.yogi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column
    @JsonIgnore
    private String title;

    @Column
    @JsonIgnore
    private String author;

    @Column
    @JsonIgnore
    private String isbn;

}
