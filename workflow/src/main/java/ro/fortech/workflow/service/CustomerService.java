package ro.fortech.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fortech.workflow.model.Customer;
import ro.fortech.workflow.repo.CustomerRepository;

@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;


  public void addCustomer(Customer customer) {
    customerRepository.save(customer);
  }
}
