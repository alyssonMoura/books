package com.alysson.books.service;

import com.alysson.books.dto.BookDTO;
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
  public MessageResponseDTO create(BookDTO bookDTO){
    Book savedBookDTO = Book.builder()
                            .name(bookDTO.getName())
                            .pages(bookDTO.getPages())
                            .publisherName(bookDTO.getPublisherName())
                            .isbn(bookDTO.getIsbn())
                            .chapters(bookDTO.getChapters())
                            .author(bookDTO.getAuthor())
                            .build();
    Book savedBook = bookRepository.save(savedBookDTO);
    return MessageResponseDTO.builder()
    .message("Book created " + savedBook.getId())
    .build();
  }
}
