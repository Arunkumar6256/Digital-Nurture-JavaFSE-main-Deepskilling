package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService {
    public Country getCountry(String code){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("country.xml");
        switch(code.toUpperCase()){
            case "IN":
                return context.getBean("india",Country.class);
            case "US":
                return context.getBean("usa", Country.class);
            case "DE":
                return context.getBean("germany", Country.class);

            case "JP":
                return context.getBean("japan", Country.class);
            default:
                throw new RuntimeException("Country not found");
        }
    }




}
