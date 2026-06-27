public class TestInt implements Test {

    @Override
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        TestInt obj = new TestInt();

        int num = 5;
        System.out.println("Square of " + num + " = " + obj.square(num));
    }
}
