package abstractClass;

public abstract class Shape {
    public abstract String getName();
}

class ShapePrinter {
    public static void printShape(Shape shape) {
        System.out.println(shape.getName());
    }

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(), new Triangle(), new Square()};
        for (Shape s : shapes) {
            ShapePrinter.printShape(s);
        }
    }
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Rhombus extends Shape {
    @Override
    public String getName() {
        return "Rhombus";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return this.getClass().getName().replaceAll(".*\\.", "");
    }
}

class Line extends Shape{
    @Override
    public String getName() {
        return this.getClass().getName().replaceAll(".*\\.", "");
    }
}



