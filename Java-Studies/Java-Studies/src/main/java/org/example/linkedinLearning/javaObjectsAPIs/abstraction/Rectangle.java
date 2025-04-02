package org.example.linkedinLearning.javaObjectsApis.abstraction;

import org.example.linkedinLearning.javaObjectsApis.abstraction.Shape;
public class Rectangle extends Shape {

    private double lenght;
    private double widht;

    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    @Override
    double calculateare(){
        return lenght * widht;
    }
}