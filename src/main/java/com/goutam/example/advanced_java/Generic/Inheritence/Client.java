package com.goutam.example.advanced_java.Generic.Inheritence;

public class Client {
    public static void main(String[] args) {
        Shapecommand<Circle> circleShapecommand = new Shapecommand<>();
        Shapecommand<Rectangle> rectangleCommand = new Shapecommand<>();
        Shapecommand<Square> squareCommand = new Shapecommand<>();
        Shapecommand<Shape> shapeCommand = new Shapecommand<>();

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Shape shape = new Shape();
        circleShapecommand.printshape(circle);
        rectangleCommand.printshape(rectangle);
        squareCommand.printshape(square);
        shapeCommand.printshape(shape);

    }
}
