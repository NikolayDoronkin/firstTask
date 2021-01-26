package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";


    @Test
    public void testReadData() throws DataException {
        DataReader reader = new DataReader();

        List<String> expected = new ArrayList<>();
        expected.add("25 44 15 3 10 22 47");

        List<String> actual = reader.readData(TEST_DATA);

        Assert.assertTrue(equals(expected, actual));

    }

    public boolean equals(List<String> firstList, List<String> secondList){
        if(firstList.size() != secondList.size()){
            return false;
        }
        for(int index = 0; index < firstList.size(); index++){
            String firstLine = firstList.get(index);
            String secondLine = secondList.get(index);
            if(!firstLine.equals(secondLine)){
                return false;
            }
        }
        return true;
    }
}
