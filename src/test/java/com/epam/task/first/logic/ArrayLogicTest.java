package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import junit.framework.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxAmongPositives() {
        //given
        Array array = new Array(33, 41, 13, 1, 5, 18);

        //when
        int actual = arrayLogic.findMax(array);
        int expected = 41;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxAmongNegative() {
        //given
        Array array = new Array(-33, -42, -813, -1, -5, -18);

        //when
        int actual = arrayLogic.findMax(array);
        int expected = -1;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMinAmongPositives() {
        //given
        Array array = new Array(33, 41, 13, 1, 5, 18);

        //when
        int actual = arrayLogic.findMin(array);
        int expected = 1;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMinAmongNegative() {
        //given
        Array array = new Array(-33, -42, -813, -1, -5, -18);

        //when
        int actual = arrayLogic.findMin(array);
        int expected = -813;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetElementWithCorrectIndex() {
        //given
        Array array = new Array(-33, -42, 664, -1, -5, -18);
        int index = 2;
        int element = 666;

        //when
        int actual = arrayLogic.setElement(array, index, element);
        int expected = 666;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSummary() {
        //given
        Array array = new Array(-33, -42, 813, -1, -5, -18);

        //when
        int actual = arrayLogic.findSummary(array);
        int expected = 714;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindAverage() {
        //given
        Array array = new Array(-33, -42, 813, -1, -5, -18);

        //when
        float actual = arrayLogic.findAverage(array);
        float expected = 119;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindCountOfPositiveNumbers() {
        //given
        Array array = new Array(-33, -42, -813, -1, -5, -18);

        //when
        int actual = arrayLogic.findCountOfPositiveNumbers(array);
        int expected = 0;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindCountOfNegativeNumbers() {
        //given
        Array array = new Array(-33, 42, -813, 1, -5, -18);

        //when
        int actual = arrayLogic.findCountOfPositiveNumbers(array);
        int expected = 2;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindCountOfNegativeNumbersAmongPositive() {
        //given
        Array array = new Array(33, 42, 813, 1, 5, 18);

        //when
        int actual = arrayLogic.findCountOfNegativeNumbers(array);
        int expected = 0;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindCountOfPositiveNumbersAmongNegative() {
        //given
        Array array = new Array(-33, -42, -813, -1, -5, -18);

        //when
        int actual = arrayLogic.findCountOfPositiveNumbers(array);
        int expected = 0;

        //then
        Assert.assertEquals(expected, actual);
    }

}

