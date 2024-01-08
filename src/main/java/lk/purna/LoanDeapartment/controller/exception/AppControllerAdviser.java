package lk.purna.LoanDeapartment.controller.exception;

import lk.purna.LoanDeapartment.controller.response.custom_error.CustomErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppControllerAdviser {

    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY) //status code ek change krl pennanwa response ekedi
    @ExceptionHandler({CustomerNotFoundException.class}) //customerNotFoundException class eken ena exception hadle krnn //thawa class walin ena ewata denn puluwan methana "," dada class tika denn one
    public CustomErrorResponse handleNFException(Exception exception){
        System.out.println(exception.getMessage());
        CustomErrorResponse customErrorResponse = new CustomErrorResponse();
        customErrorResponse.setMessage("Bad Request");

        return customErrorResponse;
    }
}
