package lk.purna.LoanDeapartment.service;

import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;

public interface LoanTypeService {

    LoanTypeResponse create(LoanTypeRequest loanTypeRequest);
}
