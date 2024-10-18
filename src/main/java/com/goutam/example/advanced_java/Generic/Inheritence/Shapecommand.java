package com.goutam.example.advanced_java.Generic.Inheritence;

public class Shapecommand <T extends Shape>{

    public void printshape(T shape) {
        System.out.println(shape.setshape());
    }
}
