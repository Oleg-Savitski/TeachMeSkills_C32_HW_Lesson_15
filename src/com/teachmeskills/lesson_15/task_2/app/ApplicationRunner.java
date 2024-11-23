package com.teachmeskills.lesson_15.task_2.app;

import com.teachmeskills.lesson_15.task_2.collections.AddedShapes;
import com.teachmeskills.lesson_15.task_2.shapes.impl.Circle;
import com.teachmeskills.lesson_15.task_2.shapes.impl.Rectangle;
import com.teachmeskills.lesson_15.task_2.shapes.impl.Triangle;

/** Create a collection of shapes.
 * Fill the collection with different shapes.
 * Loop through the collection and call the method
 * to count and display the perimeter of each shape.
 */


public class ApplicationRunner {
    public static void main(String[] args) {
        AddedShapes addedShapes = new AddedShapes();

        addedShapes.addShape(new Circle(6));
        addedShapes.addShape(new Rectangle(5, 7));
        addedShapes.addShape(new Triangle(3, 6, 2));


        addedShapes.displayShapes();
    }
}