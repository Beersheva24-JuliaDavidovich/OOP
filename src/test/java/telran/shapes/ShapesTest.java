package telran.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {

@Test
void rectangleTest() {
    Rectangle rectangle = new Rectangle(2, 3);
    assertEquals(10, rectangle.perimeter());
    assertEquals(6, rectangle.square());
}

@Test
void squareTest() {
    Square square = new Square(3);
    assertEquals(12, square.perimeter());
    assertEquals(9, square.square());
}

@Test
void canvasTest() {
    Canvas canvas = new Canvas();
    Rectangle rectangle = new Rectangle(2, 3);
    Square square = new Square(3);
    canvas.addShape(rectangle);
    canvas.addShape(square);
    assertEquals(22, canvas.perimeter());
    assertEquals(15, canvas.square());
}

@Test
void countTest() {
    //TODO
    //test of the method count of the class Canvas
    Canvas canvas = new Canvas();
    Canvas canvasTotal = new Canvas();
    Rectangle rectangle = new Rectangle(2, 3);
    Square square = new Square(3);
    Square square1 = new Square(3);
    Square square2 = new Square(3);
    canvasTotal.addShape(rectangle);
    canvasTotal.addShape(square);
    canvas.addShape(square1);
    canvas.addShape(square2);
    canvasTotal.addShape(canvas);
    assertEquals(5, canvasTotal.count());

    Square square4 = new Square(3);
    Square square5 = new Square(3);
    Canvas canvas2 = new Canvas();
    canvas2.addShape(square4);
    canvas2.addShape(square5);
    canvas.addShape(canvas2);
    assertEquals(8, canvasTotal.count());
    
}
}
