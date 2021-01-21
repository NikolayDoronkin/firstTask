package com.epam.task.first;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayLogic;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(33, 41, 13, 1, 5, 18);

        ArrayPrinter printer = new ConsoleArrayPrinter();
        ArrayLogic arrayLogic = new ArrayLogic();

        System.out.println("Исходный массив:");
        printer.printArray(array);

        arrayLogic.setElement(array, 2, -13);
        System.out.println("После замены 2-го элемента массив:");
        printer.printArray(array);

        arrayLogic.setElement(array, 3, -33);
        System.out.println("После замены 3-го элемента массив:");
        printer.printArray(array);

        arrayLogic.setElement(array, 13, 13);
        System.out.println("После замены 13-го элемента массив:");
        printer.printArray(array);

        System.out.println("_______________________________________________________________________");
        System.out.println("Минимальный элемент массива:\t\t\t\t\t\t\t" + arrayLogic.findMin(array));
        System.out.println("Максимальный элемент массива:\t\t\t\t\t\t\t" + arrayLogic.findMax(array));
        System.out.println("Среднее значение элементов массива:\t\t\t\t\t\t" + arrayLogic.findAverage(array));
        System.out.println("Сумма всех элементов массива:\t\t\t\t\t\t\t" + arrayLogic.findSummary(array));
        System.out.println("Число отрицательных элементов в массиве:\t\t\t\t" + arrayLogic.findCountOfNegativeNumbers(array));
        System.out.println("Число положительных элементов в массиве:\t\t\t\t" + arrayLogic.findCountOfPositiveNumbers(array));

    }
}
