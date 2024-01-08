package lk.purna.LoanDeapartment.service.impl;

import lk.purna.LoanDeapartment.controller.model.Customer;
import lk.purna.LoanDeapartment.controller.model.Loan;
import lk.purna.LoanDeapartment.controller.repository.CustomerRepository;
import lk.purna.LoanDeapartment.controller.repository.LoanRepository;
import lk.purna.LoanDeapartment.controller.request.LoanRequest;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final CustomerRepository customerRepository;


    public LoanResponse create(Long customerId, LoanRequest loanRequest){

        Optional<Customer> customerOptional = customerRepository.findById(customerId);

        if (! customerOptional.isPresent()){

            System.out.println("customer not found");
        }

        Customer customer = customerOptional.get();

        Loan loan = new Loan();

        loan.setAmount(loanRequest.getAmount());
        loan.setPeriod(loanRequest.getPeriod());
        loan.setCustomer(customer);

        loanRepository.save(loan);

        LoanResponse loanResponse = new LoanResponse();

        loanResponse.setId(loan.getId());
        loanResponse.setAmount(loan.getAmount());
        loanResponse.setPeriod(loan.getPeriod());

        return loanResponse;


    }


}
