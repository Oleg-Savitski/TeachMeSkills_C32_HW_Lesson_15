package com.teachmeskills.lesson_15.task_1.console;

import com.teachmeskills.lesson_15.task_1.collection.impl.IntegerCollection;
import com.teachmeskills.lesson_15.task_1.exception.InvalidInputException;
import com.teachmeskills.lesson_15.task_1.parser.impl.IntegerParser;

import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private IntegerParser parser;
    private IntegerCollection collection;

    public InputHandler() {
        this.parser = new IntegerParser();
        this.collection = new IntegerCollection();
    }

    public void handleInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers (enter 'exit' to exit):");

            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }

                try {
                    int number = parser.parse(input);
                    collection.addNumber(number);
                    System.out.println("Added a number: " + number);
                } catch (NumberFormatException e) {
                    throw new InvalidInputException("Error: '" + input + "' is not a valid integer.", e);
                }

                System.out.println("Current numbers in the collection: " + collection.getNumbers());
            }
        } catch (Exception e) {
            System.err.println("An error has occurred: " + e.getMessage());
        }
    }

    public IntegerCollection getCollection() {
        return collection;
    }

    public void printEvenAndOddNumbers() {
        List<Integer> numbers = collection.getNumbers();

        System.out.println("Even numbers in the collection:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Odd numbers in the collection:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}