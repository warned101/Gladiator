package com.lti;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

@SpringBootTest
//@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class ApplicationTests {

	@Autowired
	private CustomerRepository customerRepo;

	@Test
	void add() {
		Customer c = new Customer();
		c.setName("Mark");
		c.setEmail("mark@lti.com");
		c.setPassword("12345");
		c.setDateOfBirth(LocalDate.of(1999, 1, 28));

		customerRepo.save(c);

	}

}
