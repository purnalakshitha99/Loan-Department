package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;
import lk.purna.LoanDeapartment.service.LoanTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoanTypeController {

    private LoanTypeService loanTypeService;


    @PostMapping("/loantypes")
    public LoanTypeResponse create(@RequestBody LoanTypeRequest loanTypeRequest){
        System.out.println("loanType create");

        System.out.println(loanTypeRequest.getType());

      return   loanTypeService.create(loanTypeRequest);
    }
}
