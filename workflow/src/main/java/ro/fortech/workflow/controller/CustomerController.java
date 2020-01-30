package ro.fortech.workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fortech.workflow.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  private final CustomerService customerService;


  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

}
