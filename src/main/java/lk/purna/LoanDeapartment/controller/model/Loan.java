package lk.purna.LoanDeapartment.controller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "loans")
public class Loan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Integer period;

    @ManyToOne
    private Customer customer;


    @ManyToOne
    private LoanType loanType;

}
