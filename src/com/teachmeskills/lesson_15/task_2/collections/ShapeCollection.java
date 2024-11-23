package com.teachmeskills.lesson_15.task_2.collections;

import com.teachmeskills.lesson_15.task_2.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

    private List<Shape> shapes;

    public ShapeCollection() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}