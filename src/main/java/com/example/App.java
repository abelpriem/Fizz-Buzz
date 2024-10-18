package com.example;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println();
        System.out.println("¡El juego de Fizz-Buzz!");
        System.out.println("Introduce un número: ");
        number = scanner.nextInt();

        System.out.println();

        String string = String.valueOf(number);

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Resultado: ¡Fizz-Buzz!");
        } else if (number % 3 == 0 || string.contains("3")) {
            System.out.println("Resultado: !Fizz!");
        } else if (number % 5 == 0 || string.contains("5")) {
            System.out.println("Resultado: ¡Buzz!");
        } else {
            System.out.println(number);
        }

        scanner.close();
    }
}
