package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5);

        System.out.println("rectangle = " + rectangle);

    }
}
