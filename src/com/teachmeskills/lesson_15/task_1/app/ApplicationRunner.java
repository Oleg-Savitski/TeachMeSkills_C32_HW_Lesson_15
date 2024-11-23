package com.teachmeskills.lesson_15.task_1.app;

import com.teachmeskills.lesson_15.task_1.console.InputHandler;
import com.teachmeskills.lesson_15.task_1.exception.InvalidInputException;

/** Create a collection of integers and fill it with the values entered from the console.
 When filling a collection with numbers from the console, type casts should be made.
 * The type conversion is: com/teachmeskills/lesson_15/task_1/parser/impl/IntegerParser.java
 * To end the input, enter the word "exit".
 * When converting a string to a number, the possibility of exceptions should be considered.
 * Display even numbers from the collection on the screen.
 * The program outputs both even numbers and odd numbers.
 *
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();
        try {
            inputHandler.handleInput();
        } catch (InvalidInputException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Added numbers: " + inputHandler.getCollection().getNumbers());

        inputHandler.printEvenAndOddNumbers();
    }
}