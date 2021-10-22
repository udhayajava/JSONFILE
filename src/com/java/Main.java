package com.java;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        FileCreator obj1 = new FileCreator();
        obj1.createFile();
        File_Writer obj2 = new File_Writer();
        obj2.writeFile1();
        obj2.writeFile2();
        ReadFile obj3= new ReadFile();
        obj3.readFile1();
        obj3.readFile2();
        Compare2File obj4=new Compare2File();
        obj4.Compare2File();

}
}


