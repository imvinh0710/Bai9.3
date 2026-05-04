package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(10, calculator.sum(2, 3), "2 + 3 should be 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should be 1");
    }
}
