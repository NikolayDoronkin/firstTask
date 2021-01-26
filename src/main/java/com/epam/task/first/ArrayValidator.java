package com.epam.task.first;


public class ArrayValidator {

    public boolean validate(String line) {
        return line.matches("\\s*[\\d+\\s+]+");
        //throw new NotImplementedException();
    }

}
