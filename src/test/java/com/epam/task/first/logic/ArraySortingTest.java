package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArraySortingTest {

    @Test
    public void testBubbleSort(){
        Array array = new Array(25, 44, 15, 3, 10, 22, 47);
        ArraySorting arraySorting = new ArraySorting();

        Array expected = arraySorting.bubbleSort(array);
        Array actual = new Array(3, 10, 15, 22, 25, 44, 47);

        Assert.assertTrue(equals(expected, actual));
    }

    @Test
    public void testInsertSort(){
        Array array = new Array(25, 44, 15, 3, 10, 22, 47);
        ArraySorting arraySorting = new ArraySorting();

        Array expected = arraySorting.insertSort(array);
        Array actual = new Array(3, 10, 15, 22, 25, 44, 47);

        Assert.assertTrue(equals(expected, actual));
    }

    @Test
    public void testSelectionSort(){
        Array array = new Array(25, 44, 15, 3, 10, 22, 47);
        ArraySorting arraySorting = new ArraySorting();

        Array expected = arraySorting.selectionSort(array);
        Array actual = new Array(3, 10, 15, 22, 25, 44, 47);

        Assert.assertTrue(equals(expected, actual));
    }

    public boolean equals(Array firstArray, Array secondArray){
        List<Integer> firstElements = firstArray.getArray();
        List<Integer> secondElements = secondArray.getArray();

        if(firstElements.size() != secondElements.size()){
            return false;
        }

        for(int index = 0; index < firstElements.size(); index ++){
            int firstValue = firstElements.get(index);
            int secondValue = secondElements.get(index);
            if(firstValue != secondValue){
                return false;
            }
        }
        return true;
    }

}
