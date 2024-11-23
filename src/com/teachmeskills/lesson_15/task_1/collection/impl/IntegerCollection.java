package com.teachmeskills.lesson_15.task_1.collection.impl;

import com.teachmeskills.lesson_15.task_1.collection.NumberCollection;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection implements NumberCollection {

    private List<Integer> numbers;

    public IntegerCollection() {
        this.numbers = new ArrayList<>();
    }

    @Override
    public void addNumber(int number) {
        numbers.add(number);
    }

    @Override
    public List<Integer> getNumbers() {
        return numbers;
    }
}