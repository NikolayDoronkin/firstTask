package com.epam.task.first;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayParser {

    public Array create(String data){
        Array array = new Array();
        List<Integer> elements = array.getArray();
        String[] rawData = data.split("\\s+");
        for(String line: rawData){
            elements.add(Integer.parseInt(line));
        }
        return array;
        //throw new NotImplementedException();
    }

}
