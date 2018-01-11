/**
 * Created by khx on 17-10-21.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.printf("Howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
