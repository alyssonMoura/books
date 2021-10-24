package com.alysson.books.service;

import com.alysson.books.dto.MessageResponseDTO;
import com.alysson.books.entity.Book;
import com.alysson.books.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  
  private BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
  public MessageResponseDTO create(Book book){
    Book savedBook = bookRepository.save(book);
    return MessageResponseDTO.builder()
    .message("Book created " + savedBook.getId())
    .build();
  }
}
