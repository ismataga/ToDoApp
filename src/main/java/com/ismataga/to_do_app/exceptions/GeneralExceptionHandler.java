package com.ismataga.to_do_app.exceptions;

import com.ismataga.to_do_app.annotation.PasswordMatch;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ValidationException;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GeneralExceptionHandler  {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDetails> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(new Date() ,ex.getBindingResult().getFieldError().getField().toString() , null);

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//                                                                  @NotNull HttpHeaders headers,
//                                                                  @NotNull HttpStatusCode status,
//                                                                  @NotNull WebRequest request
//    ) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach(error -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String>  userNotFoundExceptionHandler(UserNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
