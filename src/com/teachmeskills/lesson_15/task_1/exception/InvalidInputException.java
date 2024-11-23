package com.teachmeskills.lesson_15.task_1.exception;

public class InvalidInputException extends RuntimeException {

  public InvalidInputException(String message) {
    super(message);
  }

  public InvalidInputException(String message, Throwable cause) {
    super(message, cause);
  }
}