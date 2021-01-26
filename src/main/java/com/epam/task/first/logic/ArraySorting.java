package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySorting {

    private void swap(List<Integer> elements, int firstIndex, int secondIndex) {
        int buffer = elements.get(firstIndex);
        elements.set(firstIndex, elements.get(secondIndex));
        elements.set(secondIndex, buffer);
    }

    public final Array bubbleSort(Array array) {
        List<Integer> elements = array.getArray();
        boolean wereSwapping = true;
        while (wereSwapping) {
            wereSwapping = false;
            for (int index = 0; index < elements.size() - 1; index++) {
                if (elements.get(index) > elements.get(index + 1)) {
                    swap(elements, index, index + 1);
                    wereSwapping = true;
                }
            }
        }
        return array;
    }

    public final Array insertSort(Array array) {
        List<Integer> elements = array.getArray();
        for (int left = 0; left < elements.size(); left++) {
            int currentValue = elements.get(left);
            int currentIndex = left - 1;
            for (; currentIndex >= 0; currentIndex--) {
                if (currentValue < elements.get(currentIndex)) {
                    elements.set(currentIndex + 1, elements.get(currentIndex));
                } else {
                    break;
                }
            }
            elements.set(currentIndex + 1, currentValue);
        }
        return array;
    }

    public final Array selectionSort(Array array) {
        List<Integer> elements = array.getArray();
        for (int left = 0; left < elements.size(); left++) {
            int flag = left;
            for (int currentIndex = left; currentIndex < elements.size(); currentIndex++) {
                if (elements.get(flag) > elements.get(currentIndex)) {
                    flag = currentIndex;
                }
            }
            swap(elements, left, flag);
        }
        return array;
    }
}
