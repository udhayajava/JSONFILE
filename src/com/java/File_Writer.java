package com.java;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class File_Writer extends FileCreator{
    void writeFile1() {
        JSONObject jsonObject1 = new JSONObject();
        JSONArray array = new JSONArray();
        jsonObject1.put("Name","Vijay");
        jsonObject1.put("Age",47);
        array.add("Hero");
        array.add("Actor");
        jsonObject1.put("About Him",array);
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("jsonTest1.json");
            fileWriter.write(jsonObject1.toJSONString());
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }



    }
    void writeFile2() {
        JSONObject jsonObject2 = new JSONObject();
        JSONArray array = new JSONArray();
        jsonObject2.put("Name","Rajini");
        jsonObject2.put("Age",70);
        array.add("Hero");
        array.add("Actor");
        jsonObject2.put("About Him",array);
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("jsonTest2.json");
            fileWriter.write(jsonObject2.toJSONString());
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }



    }}