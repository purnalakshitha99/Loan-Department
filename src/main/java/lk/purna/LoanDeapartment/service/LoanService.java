package lk.purna.LoanDeapartment.service;

import lk.purna.LoanDeapartment.controller.exception.CustomerNotFoundException;
import lk.purna.LoanDeapartment.controller.request.LoanRequest;
import lk.purna.LoanDeapartment.controller.response.LoanResponse;

public interface LoanService {

    LoanResponse create(Long customerId, LoanRequest loanRequest)throws CustomerNotFoundException;
}
