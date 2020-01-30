package ro.fortech.workflow.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  List<Customer>getAllCustomers(){
    return customerService.getAllCustommers();
  }
  @PostMapping
  void addCustomer(Customer customer) {
    customerService.addCustomer(customer);
  }
}
