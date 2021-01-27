package com.epam.task.first.view;

import com.epam.task.first.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    @Test
    public void testValidateWhenLineIsCorrect() {
        String inputLine = "    1 3 5 234 45    56";
        ArrayValidator validator = new ArrayValidator();

        boolean expected = validator.validate(inputLine);

        Assert.assertTrue(expected);
    }

    @Test
    public void testValidateWhenLineIsIncorrect() {
        String inputLine = "1 3 5 234 45    5fg6";
        ArrayValidator validator = new ArrayValidator();

        boolean expected = validator.validate(inputLine);

        Assert.assertFalse(expected);
    }

}
