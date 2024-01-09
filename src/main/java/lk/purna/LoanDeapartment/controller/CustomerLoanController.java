package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.request.CustomerLoanRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerLoanResponse;
import lk.purna.LoanDeapartment.service.CustomerLoanService;
import lk.purna.LoanDeapartment.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerLoanController {


    private CustomerLoanService customerLoanService;


    @PostMapping("/customers/loans")
    public CustomerLoanResponse createCustomerLoan(@RequestBody CustomerLoanRequest customerLoanRequest){

        System.out.println("customer loan crate");

        return   customerLoanService.createCustomerLoan(customerLoanRequest);

    }
}
