package lk.purna.LoanDeapartment.service;

import lk.purna.LoanDeapartment.controller.request.CustomerRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerResponse;

public interface CustomerService {

    CustomerResponse add(CustomerRequest customerRequest);
}
