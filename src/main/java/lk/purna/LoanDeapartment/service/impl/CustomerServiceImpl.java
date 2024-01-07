package lk.purna.LoanDeapartment.service.impl;

import lk.purna.LoanDeapartment.controller.model.Customer;
import lk.purna.LoanDeapartment.controller.repository.CustomerRepository;
import lk.purna.LoanDeapartment.controller.request.CustomerRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerResponse;
import lk.purna.LoanDeapartment.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private  CustomerRepository customerRepository;


    public CustomerResponse add(CustomerRequest customerRequest){

        Customer customer = new Customer();

        customer.setName(customerRequest.getName());
        customer.setAddress(customerRequest.getAddress());


        customerRepository.save(customer);

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setId(customer.getId());
        customerResponse.setName(customer.getName());
        customerResponse.setAddress(customerRequest.getAddress());

        return customerResponse;
    }
}
