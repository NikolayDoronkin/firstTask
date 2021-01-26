package com.epam.task.first.view;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ConsoleArrayPrinter implements ArrayPrinter {

    public void printArray(final Array array) {
        List<Integer> list = array.getArray();
        for (Integer element : list) {
            System.out.print(element + "\t\t\t");
        }
        System.out.println();
    }
}
