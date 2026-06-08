package com.example.crud.exception;

public class LowBalanceException extends RuntimeException {
    LowBalanceException(String message) {
        super(message);

    }
    LowBalanceException(String message, String statusCode) {
        super(message);
    }

}
