package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayLogic {

    final int ZERO = 0;


    public final Integer findMax(final Array array) {
        int maxValue = Integer.MIN_VALUE;
        List<Integer> elements = array.getArray();
        if (elements.isEmpty()) {
            return ZERO;
        }
        for (Integer element : elements) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public final Integer findMin(final Array array) {
        int minValue = Integer.MAX_VALUE;
        List<Integer> elements = array.getArray();
        if (elements.isEmpty()) {
            return ZERO;
        }
        for (Integer element : elements) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    public final Integer setElement(final Array array, final Integer index, final Integer newValue) {
        List<Integer> elements = array.getArray();
        int oldValue = elements.get(index);
        if (newValue % oldValue == 2) {
            elements.set(index, newValue);
            return newValue;
        }else{
            return oldValue;
        }
    }

    public final Integer findSummary(final Array array) {
        List<Integer> elements = array.getArray();
        int sum = ZERO;
        if (elements.isEmpty()) {
            return ZERO;
        }
        for (Integer element : elements) {
            sum += element;
        }
        return sum;
    }

    public final float findAverage(final Array array) {
        List<Integer> elements = array.getArray();
        float result = findSummary(array);
        if (result == ZERO) {
            return ZERO;
        }
        return result / elements.size();
    }

    public final Integer findCountOfPositiveNumbers(final Array array) {
        List<Integer> elements = array.getArray();
        int counter = ZERO;
        if (elements.isEmpty()) {
            return ZERO;
        }
        for (Integer element : elements) {
            if (element > ZERO) {
                counter++;
            }
        }
        return counter;
    }


    public final Integer findCountOfNegativeNumbers(final Array array) {
        List<Integer> elements = array.getArray();
        int counter = ZERO;
        if (elements.isEmpty()) {
            return ZERO;
        }
        for (Integer element : elements) {
            if (element < ZERO) {
                counter++;
            }
        }
        return counter;
    }
}
