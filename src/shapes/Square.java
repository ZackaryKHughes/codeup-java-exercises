package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("\"Square Method used\" = " + "Square Method used");
        double side = this.width;
        return side * side;
    }

    public double getPerimeter(){
        System.out.println("\"Square Method used\" = " + "Square Method used");
        double side = this.width;
        return side * 4;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }
}
