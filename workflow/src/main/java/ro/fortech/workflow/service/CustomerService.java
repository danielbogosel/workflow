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

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public void addCustomer(Customer customer) {
    customerRepository.save(customer);
  }

  public void deleteById(Integer id) {
    customerRepository.deleteById(id);
  }

  public void updateCustomer(Integer customerId, Customer customer) throws Exception {
    Optional<Customer> possibleCustomer = customerRepository.findById(customerId);
    if (possibleCustomer.isPresent()) {
      customer.setCustomerId(customerId);
      customerRepository.save(customer);
    } else {
      throw new Exception("Didn't find customer with id " + customerId);
    }

  }
}
