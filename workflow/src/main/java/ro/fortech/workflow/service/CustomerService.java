package ro.fortech.workflow.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fortech.workflow.model.Customer;
import ro.fortech.workflow.repo.CustomerRepository;

@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;


  public Optional<Customer> getCustomerById(Integer id) {
    return customerRepository.findById(id);
  }

  public List<Customer> getAllCustommers() {
    return customerRepository.findAll();
  }
  public void addCustomer(Customer customer) {
    customerRepository.save(customer);
  }
}
