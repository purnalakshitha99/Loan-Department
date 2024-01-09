package lk.purna.LoanDeapartment.service.impl;

import lk.purna.LoanDeapartment.controller.exception.LoanTypeNotFoundException;
import lk.purna.LoanDeapartment.controller.model.Loan;
import lk.purna.LoanDeapartment.controller.model.LoanType;
import lk.purna.LoanDeapartment.controller.repository.LoanTypeRepository;
import lk.purna.LoanDeapartment.controller.request.LoanTypeRequest;
import lk.purna.LoanDeapartment.controller.response.IdResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponse;
import lk.purna.LoanDeapartment.controller.response.LoanTypeResponseBuilder;
import lk.purna.LoanDeapartment.service.LoanTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoanTypeServiceImpl implements LoanTypeService {

    private final LoanTypeRepository loanTypeRepository;

    public LoanTypeResponse create(LoanTypeRequest loanTypeRequest){

        LoanType loantype = new LoanType();

        loantype.setType(loanTypeRequest.getType());


        loanTypeRepository.save(loantype);

        LoanTypeResponse loanTypeResponse = new LoanTypeResponse();

        loanTypeResponse.setId(loantype.getId());
        loanTypeResponse.setType(loanTypeRequest.getType());

        return loanTypeResponse;



    }


    //get loanTypes

    public LoanTypeResponse getSpecific(Long loanTypeId,LoanTypeRequest loanTypeRequest)throws LoanTypeNotFoundException {

        Optional<LoanType> loanTypeOptional = loanTypeRepository.findById(loanTypeId);

        LoanTypeResponse loanTypeResponse = new LoanTypeResponse();

        if (!loanTypeOptional.isPresent()){

            throw new LoanTypeNotFoundException("Loan Type Not Found "+loanTypeId);

        }

        LoanType loanType = loanTypeOptional.get();

        loanTypeResponse.setId(loanType.getId());
        loanTypeResponse.setType(loanType.getType());

        return loanTypeResponse;
    }


    public List<LoanTypeResponseBuilder> getAll(){
        List<LoanType> loanTypeList = loanTypeRepository.findAll();

        return loanTypeList.stream().map(loanType -> LoanTypeResponseBuilder.builder().id(loanType.getId()).type(loanType.getType()).build()).toList();


    }


    public IdResponse delete(Long loanTypeId)throws LoanTypeNotFoundException{

        Optional<LoanType> loanTypeOptional = loanTypeRepository.findById(loanTypeId);

        if (!loanTypeOptional.isPresent()){
            throw new LoanTypeNotFoundException("Loan Type Not Found");
        }
        loanTypeRepository.deleteById(loanTypeId);



        IdResponse idResponse = new IdResponse();

        idResponse.setId(loanTypeId);

        return idResponse;

    }

    public LoanTypeResponseBuilder update(Long loanTypeId,LoanTypeRequest loanTypeRequest)throws LoanTypeNotFoundException{

        Optional<LoanType> loanTypeOptional = loanTypeRepository.findById(loanTypeId);

        if (!loanTypeOptional.isPresent()){
            throw new LoanTypeNotFoundException("LoanType not Found "+loanTypeId);

        }
        LoanType loanType = loanTypeOptional.get();

        loanType.setType(loanTypeRequest.getType());

        loanTypeRepository.save(loanType);

        return LoanTypeResponseBuilder.builder()
                .id(loanTypeId)
                .type(loanType.getType())
                .build();
    }
}
