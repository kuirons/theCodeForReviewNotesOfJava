/**
 * Created by khx on 17-10-15.
 */
public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory sf1=new CircleFactory();
        sf1.getShape().draw();
        ShapeFactory sf2=new SquareFactory();
        sf2.getShape().draw();
    }
}
