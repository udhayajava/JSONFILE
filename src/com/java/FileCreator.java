package com.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
        File file1,file2;
        void createFile() {
            System.out.println("file name is");
            String directory = System.getProperty("user.dir");
            String path1 = directory + File.separator + "jsonTest1.json";
            String path2 = directory + File.separator + "jsonTest2.json";
            System.out.println("Filepath is" + path1);
            System.out.println("Filepath is" + path2);
            file1 = new File(path1);
            file2= new File(path2);;
        }
    }
