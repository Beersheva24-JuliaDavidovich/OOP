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
}
