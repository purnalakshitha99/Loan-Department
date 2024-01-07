package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.request.CustomerRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerResponse;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("/customers")
    public CustomerResponse add(@RequestBody CustomerRequest customerRequest){
        System.out.println("customer add");

       return customerService.add(customerRequest);

    }
}
