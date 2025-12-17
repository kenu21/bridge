package keniu;

import keniu.abstractions.Circle;
import keniu.abstractions.Rectangle;
import keniu.abstractions.Shape;
import keniu.implementations.RasterDrawingAPI;
import keniu.implementations.VectorDrawingAPI;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new VectorDrawingAPI(), 2);
        circle.draw();
        Shape rectangle = new Rectangle(new RasterDrawingAPI(), 3, 4);
        rectangle.draw();
    }
}
