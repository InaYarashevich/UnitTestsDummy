package tests;

import classes.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void aAdditionTest() {
        Assert.assertEquals(
                "The result of <add> method is incorrect.", 10, calculator.add(5, 5));
    }

    @Test
    public void bSubtractionTest() {
        Assert.assertEquals(
                "The result of <subtract> method is incorrect.", 2, calculator.subtract(4, 2));
    }

    @Test
    public void cMultiplicationTest() {
        Assert.assertEquals(
                "The result of <multiply> method is incorrect.", 8, calculator.multiply(4, 2));
    }

    @Test
    public void dDivisionTest() {
        Assert.assertEquals(
                "The result of <divide> method is incorrect.", 2, calculator.divide(4, 2));
    }
}
