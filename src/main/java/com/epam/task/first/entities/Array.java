package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private final List<Integer> array;

    public Array(Integer...array) {
        this.array = new ArrayList<>();
        this.array.addAll(Arrays.asList(array));
    }


    public List<Integer> getArray() {
        return array;
    }
}
