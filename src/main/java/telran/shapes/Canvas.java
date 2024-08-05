package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimeter() {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            counter += shapes[i].perimeter();
        }
        return counter;
    }

    @Override
    public int square() {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            counter += shapes[i].square();
        }
        return counter;
    }

    public int count() {
        // TODO
        // return number of all shapes in a canvas object
        // example: canvas has one rectangle, one square, one canvas containing two
        // squares
        // for this example the method should return 5
        int count = 0;
        for (int i = 0; i < shapes.length; i++) {
           if(shapes[i] instanceof Canvas) {
            Canvas current = (Canvas) shapes[i];
            for(int j = 0; j < current.shapes.length; j++) {
                count += 1;
            }
           }
            count += 1;
        }
        return count;
    }

}
