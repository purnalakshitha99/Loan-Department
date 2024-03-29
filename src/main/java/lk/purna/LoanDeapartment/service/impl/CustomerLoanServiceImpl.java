package lk.purna.LoanDeapartment.service.impl;

import lk.purna.LoanDeapartment.controller.exception.NotNameException;
import lk.purna.LoanDeapartment.controller.model.Customer;
import lk.purna.LoanDeapartment.controller.model.Loan;
import lk.purna.LoanDeapartment.controller.repository.CustomerRepository;
import lk.purna.LoanDeapartment.controller.repository.LoanRepository;
import lk.purna.LoanDeapartment.controller.request.CustomerLoanRequest;
import lk.purna.LoanDeapartment.controller.response.CustomerLoanResponse;
import lk.purna.LoanDeapartment.service.CustomerLoanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CustomerLoanServiceImpl implements CustomerLoanService{

    private CustomerRepository customerRepository;
    private LoanRepository loanRepository;

    //@Transactional(rollbackFor = Exception.class)//transaction eke rollback eka nisa customer wa save wenneth na loan ek save wenneth na,,mulin thiyeana state ekatamene yanne  //meka comment uanama roll back wenne ne try eka athule error() method eken passe tika arenna ita kalin tika run weyi custoemr ge table eke customer wa save weeee,namuth loan ek save nowe mokda eka thiyenne try eka athule  error() ekata psse tika run wen nathi nisa,,
    public CustomerLoanResponse createCustomerLoan(CustomerLoanRequest customerLoanRequest)throws NotNameException {

        Customer customer = new Customer();
        Loan loan = new Loan();


        customer.setName(customerLoanRequest.getName());

        customerRepository.save(customer);
        CustomerLoanResponse customerLoanResponse = new CustomerLoanResponse();


        try {
            error();

            loan.setAmount(customerLoanRequest.getAmount());
            loan.setPeriod(customerLoanRequest.getPeriod());

            //customer wath loan table ekata enn one nisa loan ekat set karanwa customerwath //one to many ekakadi many paththene foregen key eka thiyenne

            loan.setCustomer(customer);

            loanRepository.save(loan);

//            CustomerLoanResponse customerLoanResponse = new CustomerLoanResponse();

            customerLoanResponse.setId(customer.getId());
            customerLoanResponse.setName(customer.getName());
            customerLoanResponse.setPeriod(loan.getPeriod());
            customerLoanResponse.setAmount(loan.getAmount());


//            return customerLoanResponse;
        }catch (NotNameException exception){
            System.out.println(exception);

            throw new NotNameException("loan error ");

        }

        return null;

    }


    private void error()throws NotNameException{

        throw new NotNameException("Not Name Exception");
    }
}
