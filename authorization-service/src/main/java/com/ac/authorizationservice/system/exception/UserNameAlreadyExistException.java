package com.ac.authorizationservice.system.exception;

/**
 * @author hailong.sha
 */
public class UserNameAlreadyExistException extends RuntimeException {
    public UserNameAlreadyExistException() {
    }

    public UserNameAlreadyExistException(String message) {
        super(message);
    }
}
