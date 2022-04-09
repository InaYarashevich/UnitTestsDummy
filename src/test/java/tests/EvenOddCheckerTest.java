package tests;

import classes.EvenOddChecker;
import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

    @Test
    public void aCheckEvenNumberTest(){
        Assert.assertTrue("The entered number is not even.", EvenOddChecker.check(6));
    }

    @Test
    public void bCheckOddNumberTest(){
        Assert.assertFalse("The entered number is not odd.", EvenOddChecker.check(7));
    }
}
