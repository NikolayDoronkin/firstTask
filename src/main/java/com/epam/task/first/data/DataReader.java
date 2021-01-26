package com.epam.task.first.data;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> readData(String fileName) throws DataException{
        try{
            List<String> lines = new ArrayList<>();
            //чтение файла прописать здесь
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
            fileReader.close();
            return lines;

        }catch (IOException e){
            throw new DataException(e.getMessage(), e);
        }
        //throw new NotImplementedException();
    }

}
