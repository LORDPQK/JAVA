package homework;

public class java1_7 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.changeColor("yellow");
        circle1.changeSize(50);
        circle2.changeColor("green");
        circle2.changeSize(30);
        circle1.makeVisible();
        circle2.makeVisible();

        Square square = new Square();
        square.makeVisible();
        square.changeColor("red");
        square.changeSize(20);
        square.moveHorizontal(10);

        Triangle triangle = new Triangle();
        triangle.makeVisible();
        triangle.changeSize(20,10);
        triangle.changeColor("red");
        triangle.moveUp();



    }
}
