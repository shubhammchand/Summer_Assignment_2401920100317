public class Box {

    double length;
    double breadth;
    double height;

    public Box() {
        length = breadth = height = 0;
    }

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double volume() {
        return length * breadth * height;
    }
}
