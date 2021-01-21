package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    private final ArrayList<Integer> array;

    public Array(Integer...array) {
        this.array = new ArrayList<Integer>();
        this.array.addAll(Arrays.asList(array));
    }

    public Array(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }
}
