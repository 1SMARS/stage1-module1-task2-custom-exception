package com.company;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String message) {
        super(message);
    }
}
