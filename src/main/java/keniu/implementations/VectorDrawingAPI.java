package keniu.implementations;

public class VectorDrawingAPI implements DrawingAPI {

    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing circle using vector with radius: " + radius);
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.printf("Drawing rectangle using vector with width: %s and height: %s", width, height);
    }
}
