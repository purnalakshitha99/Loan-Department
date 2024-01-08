package lk.purna.LoanDeapartment.service.impl;

import lk.purna.LoanDeapartment.controller.model.Loan;
import lk.purna.LoanDeapartment.controller.model.LoanType;
import lk.purna.LoanDeapartment.controller.repository.LoanTypeRepository;
import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;
import lk.purna.LoanDeapartment.service.LoanTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoanTypeServiceImpl implements LoanTypeService {

    private final LoanTypeRepository loanTypeRepository;

    public LoanTypeResponse create(LoanTypeRequest loanTypeRequest){

        LoanType loantype = new LoanType();

        loantype.setType(loanTypeRequest.getType());


        loanTypeRepository.save(loantype);

        LoanTypeResponse loanTypeResponse = new LoanTypeResponse();

        loanTypeResponse.setId(loantype.getId());
        loanTypeResponse.setType(loanTypeRequest.getType());

        return loanTypeResponse;



    }
}
