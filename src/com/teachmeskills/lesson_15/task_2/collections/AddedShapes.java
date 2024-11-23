package com.teachmeskills.lesson_15.task_2.collections;

import com.teachmeskills.lesson_15.task_2.shapes.Shape;


public class AddedShapes {

    private ShapeCollection shapeCollection;

    public AddedShapes() {
        shapeCollection = new ShapeCollection();
    }

    public void addShape(Shape shape) {
        shapeCollection.addShape(shape);
    }

    public void displayShapes() {
        for (Shape shape : shapeCollection.getShapes()) {
            System.out.println("Figure: " + shape.getClass().getSimpleName());
            System.out.println("Square: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}