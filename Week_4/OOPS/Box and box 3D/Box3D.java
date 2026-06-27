public class Box3D extends Box {

    public Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    public static void main(String[] args) {

        Box box = new Box(5, 4, 3);

        System.out.println("Area = " + box.area());
        System.out.println("Volume = " + box.volume());

        Box3D box3d = new Box3D(6, 5, 4);

        System.out.println("Area = " + box3d.area());
        System.out.println("Volume = " + box3d.volume());
    }
}
