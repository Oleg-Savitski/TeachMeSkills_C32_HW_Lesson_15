package com.teachmeskills.lesson_15.task_3.stage.impl;

import com.teachmeskills.lesson_15.task_3.exception.InvalidSizeException;
import com.teachmeskills.lesson_15.task_3.stage.CollectionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerCollection implements CollectionInterface {

    private List<Integer> numbers;

    public IntegerCollection(int size) throws InvalidSizeException {
        if (size <= 0) {
            throw new InvalidSizeException("The size of the collection must be a positive number.");
        }
        this.numbers = new ArrayList<>(size);
        fillCollection(size);
    }

    @Override
    public void fillCollection(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }
    }

    @Override
    public double calculateAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public List<Integer> getNumbers() {
        return numbers;
    }
}