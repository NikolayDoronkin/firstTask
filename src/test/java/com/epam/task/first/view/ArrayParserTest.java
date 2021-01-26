package com.epam.task.first.view;

import com.epam.task.first.ArrayParser;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayParserTest {

    @Test
    public void testCreate(){
        String rawData = "1 2 3   454";
        ArrayParser parser = new ArrayParser();

        Array expected = parser.create(rawData);
        Array actual = new Array(1, 2, 3, 454);

        Assert.assertTrue(equals(expected, actual));

    }

    public boolean equals(Array expected, Array actual){

        List<Integer> expectedElements = expected.getArray();
        List<Integer> actualElements = actual.getArray();

        if(expectedElements.size() != actualElements.size()){
            return false;
        }

        for(int index = 0; index < expectedElements.size(); index++){

            int expectedValue = expectedElements.get(index);
            int actualValue = actualElements.get(index);

            if(expectedValue != actualValue){
                return false;
            }

        }
        return true;
    }

}
