package com.kodilla.testing.shape;

class Circle implements Shape{
    String name = "circle";
    int area = 10;
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
