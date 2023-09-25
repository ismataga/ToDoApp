//package com.ismataga.to_do_app.exceptions;
//
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//    public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler {
//
//        @ExceptionHandler(TeacherNotFoundException.class)
//        public ResponseEntity<Object> handleExceptions(TeacherNotFoundException exception, WebRequest webRequest) {
//            ExceptionResponse response = new ExceptionResponse();
//            response.setDateTime(LocalDateTime.now());
//            response.setMessage("Not found");
//            ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//            return entity;
//        }
//    }
//}
