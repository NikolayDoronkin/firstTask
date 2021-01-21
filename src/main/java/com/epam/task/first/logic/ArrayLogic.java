package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;

public class ArrayLogic {

    final String EMPTY = "Массив пуст.";
    final String WRONGING = "Данного индекса не существует.";
    final String CORRECT = "Одобрено!";
    final int ZERO = 0;


    public final Integer findMax(final Array array) {
        int maxValue = Integer.MIN_VALUE;
        ArrayList<Integer> arrayList = array.getArray();
        if (!arrayList.isEmpty()) {
            for (Integer element : arrayList) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
            return maxValue;
        } else {
            System.out.println(EMPTY);
            return ZERO;
        }
    }

    public final Integer findMin(final Array array) {
        int minValue = Integer.MAX_VALUE;
        ArrayList<Integer> arrayList = array.getArray();
        if (!arrayList.isEmpty()) {
            for (Integer element : arrayList) {
                if (element < minValue) {
                    minValue = element;
                }
            }
            return minValue;
        } else {
            System.out.println(EMPTY);
            return ZERO;
        }

    }

    public final boolean setElement(final Array array, final Integer index, final Integer element) {
        ArrayList<Integer> arrayList = array.getArray();
        if (index >= ZERO && index < arrayList.size()) {
            arrayList.set(index, element);
            System.out.println(CORRECT);
            return true;
        } else {
            System.out.println(WRONGING);
            return false;
        }
    }

    public final Integer findSummary(final Array array) {
        ArrayList<Integer> arrayList = array.getArray();
        int sum = ZERO;
        if (!arrayList.isEmpty()) {
            for (Integer element : arrayList) {
                sum += element;
            }
        } else {
            System.out.println(EMPTY);
        }
        return sum;
    }

    public final float findAverage(final Array array) {
        ArrayList<Integer> arrayList = array.getArray();
        float result = findSummary(array);
        if (result == ZERO) {
            System.out.println(EMPTY);
            return ZERO;
        }
        return (float) result / arrayList.size();
    }

    public final Integer findCountOfPositiveNumbers(final Array array) {
        ArrayList<Integer> arrayList = array.getArray();
        int counter = ZERO;
        if (!arrayList.isEmpty()) {
            for (Integer element : arrayList) {
                if (element > ZERO) {
                    counter++;
                }
            }
        } else {
            System.out.println(EMPTY);
        }
        return counter;
    }

    public final Integer findCountOfNegativeNumbers(final Array array) {
        ArrayList<Integer> arrayList = array.getArray();
        int counter = ZERO;
        if (!arrayList.isEmpty()) {
            for (Integer element : arrayList) {
                if (element < ZERO) {
                    counter++;
                }
            }
        } else {
            System.out.println(EMPTY);
        }
        return counter;
    }
}
