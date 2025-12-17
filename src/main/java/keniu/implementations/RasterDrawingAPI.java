package keniu.implementations;

public class RasterDrawingAPI implements DrawingAPI {

    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing circle using raster with radius: " + radius);
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.printf("Drawing rectangle using raster with width: %s and height: %s%n", width, height);
    }
}
