package wrapper_class;

class BoxGeneric<T> {
    private T length;
    private T breadth;
    private T radius;
    private T base;
    private T height;
    private T side;
    private T text;

    public void setLength(T length) {
        this.length = length;
    }

    public T getLength() {
        return length;
    }

    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    public T getBreadth() {
        return breadth;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getBase() {
        return base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getHeight() {
        return height;
    }

    public void setSide(T side) {
        this.side = side;
    }

    public T getSide() {
        return side;
    }

    public void setText(T text) {
        this.text = text;
    }

    public T getText() {
        return text;
    }
}

public class GenericsMain {
    public static void main(String[] args) {

        // 1. Area of Rectangle using Integer wrapper class.
        BoxGeneric<Integer> rectangle = new BoxGeneric<>();
        rectangle.setLength(20);
        rectangle.setBreadth(10);
        System.out.println("Area of Rectangle: " + rectangle.getLength() * rectangle.getBreadth());

        // 2. Area of Circle using Double wrapper class.
        BoxGeneric<Double> circle = new BoxGeneric<>();
        circle.setRadius(2.0);
        System.out.println("Area of Circle: " + Math.PI * circle.getRadius() * circle.getRadius());

        // 3. Perimeter of Square using Float wrapper class.
        BoxGeneric<Float> square = new BoxGeneric<>();
        square.setSide(3.5f);
        System.out.println("Perimeter of Square: " + 4 * square.getSide());

        // 4. Area of Triangle using Double wrapper class.
        BoxGeneric<Double> triangle = new BoxGeneric<>();
        triangle.setBase(10.0);
        triangle.setHeight(10.0);
        System.out.println("Area of Triangle: " +  0.5 * triangle.getBase() * triangle.getHeight());

        // 5. Display the Text 
        BoxGeneric<String> text= new BoxGeneric<>();
        text.setText("Above are the complete examples of Generic class using String class.");
        System.out.println("Text: " + text.getText());
    }
}
