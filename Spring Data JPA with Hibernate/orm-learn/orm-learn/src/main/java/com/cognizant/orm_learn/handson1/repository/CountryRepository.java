package com.cognizant.orm_learn.handson1.repository;

import com.cognizant.orm_learn.handson1.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}