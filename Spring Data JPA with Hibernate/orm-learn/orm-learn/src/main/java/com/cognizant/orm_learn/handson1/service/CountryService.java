package com.cognizant.orm_learn.handson1.service;

import com.cognizant.orm_learn.handson1.model.Country;
import com.cognizant.orm_learn.handson1.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Hands-on 1
    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Hands-on 7
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Hands-on 7
    @Transactional
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}