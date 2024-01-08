package lk.purna.LoanDeapartment.controller.repository;

import lk.purna.LoanDeapartment.controller.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
