package com.cognizant.orm_learn;

import com.cognizant.orm_learn.handson1.model.Country;
import com.cognizant.orm_learn.handson1.service.CountryService;
import com.cognizant.orm_learn.handson4.model.Employee;
import com.cognizant.orm_learn.handson4.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;
	private static EmployeeService employeeService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		employeeService = context.getBean(EmployeeService.class);

		testGetAllCountries();   // Hands-on 1
		testAddEmployee();       // Hands-on 4
		testAddCountry();        // Hands-on 7
	}

	// Hands-on 1
	private static void testGetAllCountries() {
		LOGGER.info("Country Test Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("Country Test End");
	}

	// Hands-on 4
	private static void testAddEmployee() {
		LOGGER.info("Employee Test Start");

		Employee employee = new Employee(101, "Arunkumar", 50000);

		employeeService.addEmployee(employee);

		LOGGER.info("Employee saved successfully");
		LOGGER.info("Employee Test End");
	}

	// Hands-on 7
	private static void testAddCountry() {
		LOGGER.info("Handson 7 Start");

		Country country = new Country("JP", "Japan");

		countryService.addCountry(country);

		Country result = countryService.findCountryByCode("JP");

		LOGGER.debug("country={}", result);

		LOGGER.info("Handson 7 End");
	}
}