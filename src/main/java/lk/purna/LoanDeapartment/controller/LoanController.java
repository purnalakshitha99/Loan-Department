package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.exception.CustomerNotFoundException;
import lk.purna.LoanDeapartment.controller.request.CustomerLoanRequest;
import lk.purna.LoanDeapartment.controller.request.LoanRequest;
import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerLoanResponse;
import lk.purna.LoanDeapartment.controller.response.IdResponse;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.service.CustomerLoanService;
import lk.purna.LoanDeapartment.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class LoanController {

    private CustomerLoanService customerLoanService;
    private LoanService loanService;


    @PostMapping("/customers/{customer-id}/loans")
    public LoanResponse create(@PathVariable("customer-id") Long customerId, @RequestBody LoanRequest loanRequest)throws CustomerNotFoundException {

        System.out.println("loan create");


        return loanService.create(customerId,loanRequest);
    }




}
