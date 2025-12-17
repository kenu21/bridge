package keniu.abstractions;

import keniu.implementations.DrawingAPI;

import java.util.Objects;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = Objects.requireNonNull(drawingAPI);
    }

    public abstract void draw();
}
