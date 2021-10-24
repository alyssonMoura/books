package com.alysson.books.repository;

import com.alysson.books.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long>{
  
}
