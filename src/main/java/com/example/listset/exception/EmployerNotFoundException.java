package com.example.listset.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployerNotFoundException extends RuntimeException {
    public EmployerNotFoundException() {
    }

    public EmployerNotFoundException(String message) {
        super(message);
    }

    public EmployerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployerNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmployerNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
