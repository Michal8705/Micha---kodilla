package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    //       Sprawdzenie czy lista zawiera dwa kształty    //
    @Test
    public void Test1() {
        //Given
        Shape shape = new Circle();
        Shape shape2 = new Rectangle();
        ShapeCollector task = new ShapeCollector();

        //When
        task.addFigure(shape);
        task.addFigure(shape2);

        //Then
        Assert.assertEquals(2, task.shapes.size());
    }

    //       Sprawdzenie czy usunięty zostanie shape2   //
    @Test
    public void Test2() {
        //Given
        Shape shape = new Circle();
        Shape shape2 = new Circle();
        Shape shape3 = new Rectangle();
        Shape shape4 = new Rectangle();
        Shape shape5 = new Rectangle();
        ShapeCollector task = new ShapeCollector();

        //When
        task.addFigure(shape);
        task.addFigure(shape2);
        task.addFigure(shape3);
        task.addFigure(shape4);
        task.addFigure(shape5);

        boolean result = task.removeFigure(shape2);

        //Then
        Assert.assertFalse(result);
    }

    //       Sprawdzenie czy wyświetlony zostanie shape4   //
    @Test
    public void Test3() {
        //Given
        Shape shape = new Circle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        Shape shape4 = new Rectangle();
        Shape shape5 = new Square();
        ShapeCollector task = new ShapeCollector();

        //When
        task.addFigure(shape);
        task.addFigure(shape2);
        task.addFigure(shape3);
        task.addFigure(shape4);
        task.addFigure(shape5);

        Shape retrivedShape = task.getFigure(3);

        //Then
        Assert.assertEquals(shape4, retrivedShape);
    }
}
