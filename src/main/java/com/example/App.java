package com.example;

public final class App {

    public static String getFizzBuzzResult(int number) {
        String string = String.valueOf(number);

        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz-Buzz";
        } else if (number % 3 == 0 || string.contains("3")) {
            return "Fizz";
        } else if (number % 5 == 0 || string.contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
