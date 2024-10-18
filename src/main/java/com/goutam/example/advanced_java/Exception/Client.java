package com.goutam.example.advanced_java.Exception;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args)  throws FileNotFoundException,NullPointerException {
        LearnException le = new LearnException();
        le.Readfile("abc.txt");
        try{
        le.Readfile2("Goutam");
    }
        catch(FileNotFoundException e){
        System.out.println("File not found exception");
        }
//        le.Readfile2("Risshan");

            le.stringex();

            int i = le.checkexcep();
            System.out.println(i);
        }
}
