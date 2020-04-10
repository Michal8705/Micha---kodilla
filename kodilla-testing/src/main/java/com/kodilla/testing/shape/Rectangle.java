package com.kodilla.testing.shape;

class Rectangle implements Shape{
    String name = "Rectangle";
    int area = 15;
    public String getShapeName() {
        return  name;
    }
    public int getField() {
        return  area;
    }
    public String toString(){
        return name + "," + area ;
    }
}
