package com.example.back.common.exception;

public class MemberException extends BlueRoseException {
    public MemberException(ExceptionMessage message) {
        super(message.getText());
    }
}
