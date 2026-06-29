package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Testing Setter Injection
        BookService setterservice =
                context.getBean("bookServiceSetter",BookService.class);

        setterservice.displayBook();

        // Testing Constructor Injection
        BookService constructorService =
                context.getBean("bookServiceConstructor", BookService.class);
        constructorService.displayBook();
    }
}