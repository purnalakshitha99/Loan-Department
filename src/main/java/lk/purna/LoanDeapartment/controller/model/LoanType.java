package lk.purna.LoanDeapartment.controller.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "loantypes")
@Data
public class LoanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
}
