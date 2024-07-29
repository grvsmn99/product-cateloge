package com.gaurav.productcatalog.exception;

import com.gaurav.productcatalog.exception.pojo.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductcatalogException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseException> handleExceptions(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body
        (ResponseException.builder().message(ex.getMessage()).build());
    }
}
