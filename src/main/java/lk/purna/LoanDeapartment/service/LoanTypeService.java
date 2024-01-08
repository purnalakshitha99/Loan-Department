package lk.purna.LoanDeapartment.service;

import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.IdResponse;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponseBuilder;

import java.util.List;

public interface LoanTypeService {

    LoanTypeResponse create(LoanTypeRequest loanTypeRequest);

    LoanTypeResponse getSpecific(Long loanTypeId,LoanTypeRequest loanTypeRequest);

    List<LoanTypeResponseBuilder> getAll();

    IdResponse delete(Long loanTypeId);

    LoanTypeResponseBuilder update(Long loanTypeId,LoanTypeRequest loanTypeRequest);
}
