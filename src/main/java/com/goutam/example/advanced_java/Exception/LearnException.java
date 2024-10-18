package com.goutam.example.advanced_java.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnException {

    public void Readfile(String filename) {
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found in records");
        }
    }

    public void Readfile2(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);


    }

    public void stringex() throws NullPointerException {
        String s = getstringdetails();
        if (s != null) {
            System.out.println(s.length());
        }}

        public String getstringdetails () {
            return null;
    }

    public int checkexcep(){
        try{
            if(false){
                throw new IOException();
            }
            return 1;
        }

        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
//
        finally{
            try {
                if(true){
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException nullPointerException){
                System.out.println("nullPointerException.getMessage()");
            }
            return 2;

        }
    }
}
