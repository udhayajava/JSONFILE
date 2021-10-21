package com.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare2File extends ReadFile {
    void Compare2File() throws IOException {
        this.fileReader1 = new FileReader("jsonTest1.json");
        this.fileReader2 = new FileReader("jsonTest2.json");
        String lineOne= String.valueOf(fileReader1.read());
        String lineTwo= String.valueOf(fileReader2.read());
        boolean equals= true;
        int lineNum=1;
        While (lineOne != null||lineOne != null);
        }

    private void While(boolean b) {
    }
}
