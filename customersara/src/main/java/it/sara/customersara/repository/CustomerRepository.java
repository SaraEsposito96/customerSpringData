package it.sara.customersara.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.sara.customersara.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}
