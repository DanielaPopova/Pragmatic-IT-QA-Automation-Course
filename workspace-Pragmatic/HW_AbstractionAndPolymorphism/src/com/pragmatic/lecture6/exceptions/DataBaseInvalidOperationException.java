package com.pragmatic.lecture6.exceptions;

public class DataBaseInvalidOperationException extends RuntimeException{

	public DataBaseInvalidOperationException(String message) {
        super(message);
    }
}
