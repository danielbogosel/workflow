package ro.fortech.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fortech.workflow.repo.CustomerRepository;

@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;


}
