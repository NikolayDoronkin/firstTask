package com.epam.task.first.view;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.ArrayParser;
import com.epam.task.first.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA1 = Arrays.asList("1 2 3", "3g 5 7");
    private final static List<String> TEST_DATA2 = Arrays.asList("1 2", "3g 5 7");

    @Test
    public void testProcessWithEquality() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA1);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate("1 2 3")).thenReturn(true);
        when(validator.validate("3g 5 7")).thenReturn(false);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.create("1 2 3")).thenReturn(new Array(1, 2, 3));

        ArrayCreator creator = new ArrayCreator(reader, validator, parser);

        List<Array> actual =  creator.process("");

        List<Array> expected = new ArrayList<>();
        expected.add(new Array(1, 2, 3));

        Assert.assertTrue(equals(expected, actual));

    }


    @Test
    public void testProcessWithoutEquality() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA2);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate("1 2")).thenReturn(true);
        when(validator.validate("3g 5 7")).thenReturn(false);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.create("1 2")).thenReturn(new Array(1, 2));

        ArrayCreator creator = new ArrayCreator(reader, validator, parser);

        List<Array> actual =  creator.process("");

        List<Array> expected = new ArrayList<>();
        expected.add(new Array(1, 2, 3));

        Assert.assertFalse(equals(expected, actual));

    }

    public boolean equals(List<Array> firstList, List<Array> secondList){


        for(int index = 0; index < firstList.size(); index++){

            Array first = firstList.get(index);
            Array second = secondList.get(index);

            List<Integer> firstElements = first.getArray();
            List<Integer> secondElements = second.getArray();

            if(firstElements.size() != secondElements.size()){
                return false;
            }

            for(int compareIndex = 0; compareIndex < firstElements.size(); compareIndex++){

                int firstElement = firstElements.get(compareIndex);
                int secondElement = secondElements.get(compareIndex);

                if(firstElement != secondElement){
                    return false;
                }
            }
        }
        return true;
    }


}
