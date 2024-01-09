package lk.purna.LoanDeapartment.controller.request;

import lombok.Data;

@Data
public class CustomerLoanRequest {

    private Long id;
    private String name;
    private Double amount;
    private Integer period;


}
