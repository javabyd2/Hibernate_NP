package com.sda.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "reader")
public class ReaderEntity {

    @Column(nullable = false, length = 128)
    private String first_name;
    @Column(nullable = false, length = 128)
    private String last_name;
    private Integer currentlyBorrowedBooks;
    private Integer borrowedBooksCount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
