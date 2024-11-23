package com.teachmeskills.lesson_15.task_3.app;

import com.teachmeskills.lesson_15.task_3.exception.InvalidSizeException;
import com.teachmeskills.lesson_15.task_3.stage.impl.IntegerCollection;

import java.util.Scanner;

/** Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the size of the collection be set from the console.
 * Provide for checking the entered collection size for validity.
 * Calculate and display the arithmetic mean of all the items in the collection.
 */

public class ApplicationRunner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the collection of integers: ");
            int size = Integer.parseInt(scanner.nextLine());

            IntegerCollection collection = new IntegerCollection(size);
            double average = collection.calculateAverage();

            System.out.println("Arithmetic mean: " + average);
            System.out.println("Collection items: " + collection.getNumbers());
        } catch (NumberFormatException e) {
            System.out.println("Error: no number was entered.");
        } catch (InvalidSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}