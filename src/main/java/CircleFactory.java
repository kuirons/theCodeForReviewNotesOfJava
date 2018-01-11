/**
 * Created by khx on 17-10-15.
 */
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
