package ro.fortech.workflow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fortech.workflow.model.Customer;
import ro.fortech.workflow.repo.CustomerRepository;

@SpringBootApplication
public class WorkflowApplication {

  public static void main(String[] args) {
    SpringApplication.run(WorkflowApplication.class, args);
  }

  @Bean
  CommandLineRunner atStartup(CustomerRepository repo) {
    return args -> {
      repo.save(new Customer("ALex", "Romania", "Bumbacului 23"));
      repo.save(new Customer("Nitu", "UK", "Tea 3"));
      repo.save(new Customer("Mircea", "Romania", "Zorilor 22"));
      repo.save(new Customer("Anca", "UK", "Adress 3"));
      repo.save(new Customer("Nitu", "Romania", "Bumbacului 32"));

    };

  }
}