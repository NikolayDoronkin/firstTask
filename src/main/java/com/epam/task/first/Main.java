package com.epam.task.first;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayLogic;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(33, 41, 13, 1, 5, 18);

        ArrayPrinter printer = new ConsoleArrayPrinter();

        System.out.println("Array:");
        printer.printArray(array);


    }
}
