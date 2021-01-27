package com.epam.task.first;


public class ArrayValidator {

    private final static String REG_ARRAY = "\\s*[\\d+\\s+]+";

    public boolean validate(String line) {
        return line.matches(REG_ARRAY);
        //throw new NotImplementedException();
    }

}
