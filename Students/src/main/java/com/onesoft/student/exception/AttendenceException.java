package com.onesoft.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
;
@RestControllerAdvice
public class AttendenceException {
	@ExceptionHandler(AttendanceLowException.class)
	public ResponseEntity<Object> noprod(){
		return new ResponseEntity<>("not eligibile for school ",HttpStatus.NOT_FOUND);
	}


}
