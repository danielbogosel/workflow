package ro.fortech.workflow.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fortech.workflow.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
