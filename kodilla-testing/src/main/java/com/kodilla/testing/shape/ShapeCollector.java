package com.kodilla.testing.shape;

import java.util.*;
import java.lang.*;

class ShapeCollector {
    public int n;
    public ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = true;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = false;
            }
        return result;
   }
    public Shape getFigure(int n) {
        Shape show = shapes.get(n);
        return show;
    }
}
