package com.example.back.common.exception;

public abstract class BlueRoseException extends RuntimeException {
    public BlueRoseException(String message) {
        super(message);
    }
}
