package com.auth2.auth2_recourceserver.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String car, String id, Long id1) {
        super(car + " with " + id + " " + id1 + " was not found");
    }
}
