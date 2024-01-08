package lk.purna.LoanDeapartment.controller;

import lk.purna.LoanDeapartment.controller.exception.LoanTypeNotFoundException;
import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.IdResponse;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponseBuilder;
import lk.purna.LoanDeapartment.service.LoanTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/loantypes/{loantype-id}")
    public LoanTypeResponse getSpecific(@PathVariable("loantype-id")Long loanTypeId,@RequestBody LoanTypeRequest loanTypeRequest)throws LoanTypeNotFoundException {

        System.out.println("get specific loan type");

       return loanTypeService.getSpecific(loanTypeId,loanTypeRequest);
    }

    @GetMapping("/loantypes")
    public List<LoanTypeResponseBuilder> getAll(){
        System.out.println("get all loanType ");

       return loanTypeService.getAll();
    }

    @DeleteMapping("/loantypes/{loantypes-id}")
    public IdResponse delete(@PathVariable("loantypes-id")Long loanTypeId){


     return    loanTypeService.delete(loanTypeId);
    }


    @PutMapping("/loantypes/{loantype-id}")
    public LoanTypeResponseBuilder update(@PathVariable("loantype-id")Long loanTypeId,@RequestBody LoanTypeRequest loanTypeRequest){
        System.out.println("update loanType");

        return loanTypeService.update(loanTypeId,loanTypeRequest);
    }
}
