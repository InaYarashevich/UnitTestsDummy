package tests;

import org.junit.Assert;
import org.junit.Test;

import classes.Rectangle;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(8.5, 5.5);

    @Test
    public void aCheckDefaultLengthTest() {
        Assert.assertEquals("Default length is not correct.", 8.5, rectangle.getLength(), 0);
    }

    @Test
    public void bCheckDefaultWidthTest() {
        Assert.assertEquals("Default width is not correct.", 5.5, rectangle.getWidth(), 0);
    }

    @Test
    public void cCheckSetterLengthTest() {
        rectangle.setLength(20);
        Assert.assertEquals("Rectangle length set in setter is not correct.", 20, rectangle.getLength(), 0);
    }

    @Test
    public void dCheckSetterWidthTest() {
        rectangle.setWidth(10);
        Assert.assertEquals("Rectangle width set in setter is not correct.", 10, rectangle.getWidth(), 0);
    }

    @Test
    public void eCheckGetAreaTest() {
        Assert.assertEquals("Area set in getter is not correct.", 46.75, rectangle.getArea(), 0);
    }

    @Test
    public void fCheckConstructorLengthTest() {
        Rectangle rectangle = new Rectangle(25, 15);
        Assert.assertEquals("Length set in constructor is not correct", 25, rectangle.getLength(), 0);
    }

    @Test
    public void fCheckConstructorWidthTest() {
        Rectangle rectangle = new Rectangle(25, 15);
        Assert.assertEquals("Width set in constructor is not correct", 15, rectangle.getWidth(), 0);
    }
}
