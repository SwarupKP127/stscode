package com.javatechie.spring;

//import lombok.AllArgsConstructor;
//import lombok.Data;


import org.springframework.http.HttpStatus;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//@Data
//@AllArgsConstructor
public class AppError {
//    public AppError(String string, String message2, HttpStatus internalServerError) {
//		// TODO Auto-generated constructor stub
//	}
	private String errorCode;
    private String message;
    private HttpStatus httpStatus;
	public AppError() {
	}
	public AppError(String errorCode, String message, HttpStatus httpStatus) {
		this.errorCode = errorCode;
		this.message = message;
		this.httpStatus = httpStatus;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	@Override
	public String toString() {
		return "AppError [errorCode=" + errorCode + ", message=" + message + ", httpStatus=" + httpStatus + "]";
	}
    
    
    
    
    
    
    
    
    
}
