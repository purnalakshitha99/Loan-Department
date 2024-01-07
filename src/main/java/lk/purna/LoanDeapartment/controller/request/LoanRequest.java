package lk.purna.LoanDeapartment.controller.request;

import lombok.Data;

@Data

public class LoanRequest {

    private Long id;
    private Double amount;
    private Integer period;
}
