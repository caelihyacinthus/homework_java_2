import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Circle circle = new Circle(3.0, "purple", false);
        Rectangle rectangle = new Rectangle(1, 2);
        Square square = new Square(4);

//        System.out.println(shape);
//        System.out.println(circle);
//        System.out.println(rectangle);
//        square.setLength(2);
//        System.out.println(square);
//        System.out.println(square.getWidth());
//        square.setLength(4);
//        System.out.println(square.getWidth());
//        System.out.println(square.getArea());

//        System.out.println();

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);
        shapeList.add(rectangle);
        shapeList.add(circle);
        shapeList.add(square);

        for (Shape s : shapeList) {
            System.out.println(s);
            System.out.println("Area " + s.getArea() + " perimeter " + s.getPerimeter());
        }

        double maxPerimeter = 0;
        for (Shape s : shapeList) {
            double p = s.getPerimeter();
            if (p > maxPerimeter) maxPerimeter = p;
        }
        System.out.println(maxPerimeter);
    }
}
