package com.example.areacalculator;

public class AreaClass {
    float length, breadth;
    public AreaClass(float length, float breadth){
        this.length = length;
        this.breadth = breadth;

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float calculateArea(){
        return this.length * this.breadth;
    }
}
