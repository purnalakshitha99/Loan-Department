package lk.purna.LoanDeapartment.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoanTypeResponseBuilder {

    private Long id;
    private String type;
}
