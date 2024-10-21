package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

    App app = new App();

    @Test
    public void testFizzWhenDivisibleBy3() {
        assertEquals("Fizz", App.getFizzBuzzResult(9));
    }

    @Test
    public void testBuzzWhenDivisibleBy5() {
        assertEquals("Buzz", App.getFizzBuzzResult(10));
    }

    @Test
    public void testFizzBuzzWhenDivisibleBy3And5() {
        assertEquals("Fizz-Buzz", App.getFizzBuzzResult(15));
    }

    @Test
    public void testFizzWhenContains3() {
        assertEquals("Fizz", App.getFizzBuzzResult(31));
    }

    @Test
    public void testBuzzWhenContains5() {
        assertEquals("Buzz", App.getFizzBuzzResult(52));
    }

    @Test
    public void testFizzBuzzWhenDivisibleAndContains() {
        assertEquals("Fizz-Buzz", App.getFizzBuzzResult(30));
    }

    @Test
    public void testNumberWhenNotDivisibleOrContains() {
        assertEquals("71", App.getFizzBuzzResult(71));
    }
}