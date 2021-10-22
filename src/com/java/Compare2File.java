package com.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compare2File extends ReadFile {
   void Compare2File() {
//        BufferedReader reader1 =new BufferedReader(new FileReader("jsonTest1.json"));
//        BufferedReader reader2 =new BufferedReader(new FileReader("jsonTest2.json"));
//        String lineOne = reader1.readLine();
//        String lineTwo = reader1.readLine();
//        boolean equals= true;
//        int lineNum=1;
//        while(lineOne != null||lineOne != null)
//    {
//            if(lineOne == null || lineTwo == null){
//                equals=false;
//                break;
//            }
//            else if(! lineOne.equalsIgnoreCase(lineTwo)){
//                equals=false;
//                break;
//            }
//            lineOne= reader1.readLine();
//            lineTwo= reader2.readLine();
//            lineNum++;
//        }
//        if (equals==true){
//            System.out.println("Two Files Same Content:");
//        }
//        else{
//            System.out.println("Two files have different content. They differ at line     " +lineOne);
//            System.out.println("File1 has    "+lineOne+"    and File2 has   "+lineTwo+ "   at line   "+lineNum);
//        }
//        reader1.close();
//        reader2.close();
//
//    }
       try {
       BufferedReader reader1;
       BufferedReader reader2;

       //Initializing  wordCount and lineCount to 0
       int wordCount1 = 0;
       int wordCount2 = 0;

       int lineCount1 = 0;
       int lineCount2 =0;
       //Creating BufferedReader object
           reader1= new BufferedReader(new FileReader("jsonTest1.json"));
           reader2=new BufferedReader(new FileReader("jsonTest2.json"));

           //Reading the first line into currentLine

           String currentLine1;
           String currentLine2;
           currentLine1 = reader1.readLine();
           currentLine2 = reader2.readLine();

           while (currentLine1 != null || currentLine2 != null) {
               //Updating the lineCount

               lineCount1++;
               lineCount2++;

               //number of words in currentLine

               String[] words1 = currentLine1.split(" ");
               String[] words2 = currentLine2.split(" ");

               //Updating the wordCount

               wordCount1 = wordCount1 + words1.length;
               wordCount2 = wordCount2 + words2.length;

               currentLine1 = reader1.readLine();
               currentLine2 = reader1.readLine();
           }

           boolean checkLineIf;
           checkLineIf = (lineCount1 == 10||lineCount2== 10);
           //Printing wordCount and lineCount
           if (checkLineIf) {
               System.out.println("There are same lines ");
           } else {
               System.out.println("There are different lines ");
           }
           System.out.println("Number Of Words In File1 : " + wordCount1);
           System.out.println("Number Of Lines In File1 : " + lineCount1);
           System.out.println("Number Of Words In File2 : " + wordCount2);
           System.out.println("Number Of Lines In File2 : " + lineCount2);
           // Boolean.compare(lineCount);
       } catch (IOException exceptions)
    {
           exceptions.printStackTrace();
       }
       }
   }
