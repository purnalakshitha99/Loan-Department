package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.request.LoanRequest;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class LoanController {

    private LoanService loanService;


    @PostMapping("/customers/{customer-id}/loans")
    public LoanResponse create(@PathVariable("customer-id") Long customerId, @RequestBody LoanRequest loanRequest){

        System.out.println("loan create");

       
        return loanService.create(customerId,loanRequest);
    }
}
