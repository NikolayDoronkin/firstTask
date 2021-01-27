package com.epam.task.first;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayParser {

    private final static String REG_SPACE = "\\s+";

    public Array create(String data) {
        Array array = new Array();
        List<Integer> elements = array.getArray();
        String[] rawData = data.split(REG_SPACE);
        for (String line : rawData) {
            elements.add(Integer.parseInt(line));
        }
        return array;
        //throw new NotImplementedException();
    }

}
