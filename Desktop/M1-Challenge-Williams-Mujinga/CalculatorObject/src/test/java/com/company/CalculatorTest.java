package com.company;

import org.junit.Test;
import static  org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static Calculator calc = new Calculator();
    @Test
    public void shouldReturnSumOfTwoInts() {

        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 2, calc.add(1, 1));
    }
    @Test
    public void shouldReturnDifferenceOfTwoInts() {

        String failMessage = "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage, -29, calc.subtract(23, 52));

    }
    @Test
    public void shouldReturnProductOfTwoInts() {

        String failMessage = "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage, 68, calc.multiply(34, 2));

    }

    @Test
    public void shouldReturnQuotientOfTwoInts() {

        String failMessage = "Expected calculator to handle integer division.";

        assertEquals(failMessage, 4, calc.divide(12, 3));
        assertEquals(failMessage,1, calc.divide(12, 7));
    }

    @Test
    public void shouldReturnSumOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 5.7, calc.add(3.4d, 2.3d), .0001);

    }
    @Test
    public void shouldReturnDifferenceOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double subtraction.";
        assertEquals(failMessage, 5.0, calc.subtract(5.5d, 0.5d), .0001);

    }
    @Test
    public void shouldReturnProductOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double multiplication.";
        assertEquals(failMessage, 29.48, calc.multiply(6.7d, 4.4d), .0001);

    }
    @Test
    public void shouldReturnQuotientOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double division.";
        assertEquals(failMessage, 4.9091, calc.divide(10.8d, 2.2d), .0001);

    }


}