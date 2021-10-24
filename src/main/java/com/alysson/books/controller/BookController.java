package com.alysson.books.controller;

import javax.validation.Valid;

import com.alysson.books.dto.BookDTO;
import com.alysson.books.dto.MessageResponseDTO;
import com.alysson.books.entity.Book;
import com.alysson.books.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {

  private BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }


  @GetMapping
  public String message(){
    return "teste";
  }
  @PostMapping
  public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
    return bookService.create(bookDTO);
  }
  
}
