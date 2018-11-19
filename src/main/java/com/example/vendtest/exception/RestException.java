package com.example.vendtest.exception;

import org.springframework.http.HttpStatus;

public class RestException extends Exception {
    private HttpStatus httpStatus;

    public RestException(HttpStatus httpStatus, String message) {
        super(message);

        this.httpStatus = httpStatus;
    }

    public RestException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
