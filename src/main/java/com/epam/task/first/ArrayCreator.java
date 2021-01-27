package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> process(String fileName) throws DataException {

        List<Array> arraysResult = new ArrayList<>();
        List<String> dataList = dataReader.readData(fileName);

        for (String line : dataList) {
            if (validator.validate(line)) {
                arraysResult.add(parser.create(line));
            }
        }
        return arraysResult;
        // throw new NotImplementedException();
    }


}
