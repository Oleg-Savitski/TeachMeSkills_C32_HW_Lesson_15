package com.teachmeskills.lesson_15.task_1.parser.impl;

import com.teachmeskills.lesson_15.task_1.parser.NumberParser;

public class IntegerParser implements NumberParser {

    @Override
    public int parse(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}