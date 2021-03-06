package ro.fortech.workflow.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fortech.workflow.model.Customer;
import ro.fortech.workflow.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  private final CustomerService customerService;


  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{id}")
  Optional<Customer> getById(@PathVariable Integer id) {
    return customerService.getCustomerById(id);
  }

  @GetMapping
  List<Customer> getAllCustomers() {
    return customerService.getAllCustomers();
  }

  @PostMapping
  void addCustomer(Customer customer) {
    customerService.addCustomer(customer);
  }

  @DeleteMapping("/{customerId}")
  void deleteCustomer(@PathVariable Integer customerId) {
    customerService.deleteById(customerId);
  }

  @PutMapping
  void updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer)
      throws Exception {
    customerService.updateCustomer(customerId, customer);

  }

}
