package keniu.abstractions;

import keniu.implementations.DrawingAPI;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(DrawingAPI drawingAPI, int width, int height) {
        super(drawingAPI);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(width, height);
    }
}
