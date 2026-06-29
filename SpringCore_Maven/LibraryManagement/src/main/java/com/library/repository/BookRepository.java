package com.library.repository;

public class BookRepository {

    public String getBook(){
        System.out.println("Fetching Book from Repository");
        return "Spring in Action";
    }
}
