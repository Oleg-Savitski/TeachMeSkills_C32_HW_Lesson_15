package com.teachmeskills.lesson_15.task_2.shapes.impl;

import com.teachmeskills.lesson_15.task_2.shapes.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}