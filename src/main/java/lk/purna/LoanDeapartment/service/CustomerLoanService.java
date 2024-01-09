package lk.purna.LoanDeapartment.service;

import lk.purna.LoanDeapartment.controller.exception.NotNameException;
import lk.purna.LoanDeapartment.controller.request.CustomerLoanRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerLoanResponse;

public interface CustomerLoanService {

    CustomerLoanResponse createCustomerLoan(CustomerLoanRequest customerLoanRequest)throws NotNameException;
}
