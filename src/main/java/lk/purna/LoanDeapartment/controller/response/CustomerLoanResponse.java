package lk.purna.LoanDeapartment.controller.response;

import lombok.Data;

@Data
public class CustomerLoanResponse {

    private Long id;
    private String name;
    private Double amount;
    private Integer period;
}
