package interfaceClass;

public interface ShapeI {
    public void name();
}

class Shaper {
    public void getShapeName(ShapeI shapeI) {
        shapeI.name();
    }

    public static void main(String[] args) {
        Shaper shaper = new Shaper();
        shaper.getShapeName(new Square());
        shaper.getShapeName(new Triangle());

    }
}

class Circle implements ShapeI {
    @Override
    public void name() {
        System.out.println("interfaceClass.Circle");
    }
}

class Triangle implements ShapeI {
    @Override
    public void name() {
        System.out.println("interfaceClass.Triangle");
    }
}

class Square implements ShapeI {
    @Override
    public void name() {
        System.out.println("interfaceClass.Square");
    }
}

class Rectangle implements ShapeI {
    @Override
    public void name() {
        System.out.println("interfaceClass.Rectangle");
    }
}
class Rhombus implements ShapeI {
    @Override
    public void name() {
        System.out.println("interfaceClass.Rhombus");
    }
}