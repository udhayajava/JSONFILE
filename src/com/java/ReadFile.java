package com.java;

import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.Iterator;

public class ReadFile {
    FileReader fileReader1,fileReader2;
    void readFile1() throws IOException, ParseException {
        JSONParser jsonParser1 = new JSONParser();
        this.fileReader1= new FileReader("jsonTest1.json");
        Object parsedObject1 = jsonParser1.parse(fileReader1);
        JSONObject jsonObject1= (JSONObject) parsedObject1;
        String name= (String) jsonObject1.get("Name");
        long age=(long) jsonObject1.get("Age");
       JSONArray array= (JSONArray) jsonObject1.get("About Him");
       Iterator iterator=array.iterator();
        System.out.println("Name is ===> " +name);
        System.out.println("Age is  ===> " +age);
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
    void readFile2()throws IOException, ParseException{
        JSONParser jsonParser2 = new JSONParser();
        this.fileReader2 = new FileReader("jsonTest2.json");
        Object parsedObject2 = jsonParser2.parse(fileReader2);
        JSONObject jsonObject2= (JSONObject) parsedObject2;
        String name= (String) jsonObject2.get("Name");
        long age=(long) jsonObject2.get("Age");
        JSONArray array= (JSONArray) jsonObject2.get("About Him");
        Iterator iterator=array.iterator();
        System.out.println("Name is ===>  " +name);
        System.out.println("Age is  ===>  " +age);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
