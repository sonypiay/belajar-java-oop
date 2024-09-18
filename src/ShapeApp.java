public class ShapeApp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();

        System.out.println("Shape Corner: " + rectangle.getParentCorner());
        System.out.println("Rectangle Corner: " + rectangle.getCorner());
    }
}
