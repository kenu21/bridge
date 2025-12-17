package keniu.abstractions;

import keniu.implementations.DrawingAPI;

public class Circle extends Shape {
    private final int radius;

    public Circle(DrawingAPI drawingAPI, int radius) {
        super(drawingAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(radius);
    }
}
