package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    BookRepository repository;
    public BookService(){

    }
    public void setRepository(BookRepository repository){
        this.repository = repository;
    }
    public BookService(BookRepository repository){
        this.repository = repository;
    }
    public void displayBook(){
        System.out.println("Book Name: "+repository.getBook());
    }
}
