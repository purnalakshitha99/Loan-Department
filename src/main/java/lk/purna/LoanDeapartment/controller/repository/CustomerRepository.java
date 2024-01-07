package lk.purna.LoanDeapartment.controller.repository;

import lk.purna.LoanDeapartment.controller.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
