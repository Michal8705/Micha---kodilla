package com.kodilla.testing.shape;

class Square implements Shape{
    String name = "Square";
    int area = 20;
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
