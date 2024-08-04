package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes;
    public Canvas() {
        shapes = new Shape[0];
    }

    void addShape(Shape shape) {
        shapes = Arrays.insert(shapes,shapes.length, shape);
    }
    @Override
    public int perimeter() {
        int counter = 0;
        for(int i = 0; i < shapes.length; i++) {
            counter += shapes[i].perimeter();
        }
        return counter;
    }

    @Override
    public int square() {
        int counter = 0;
        for(int i = 0; i < shapes.length; i++) {
            counter += shapes[i].square();
        }
        return counter;
    }

}
