import static sun.java2d.cmm.ColorTransform.In;

/** Created by khx on 17-10-10. */
public class AnonymousInnerClass {
  private int i = 1;
  private int j = 2;
  public In in =
      new In() {
        @Override
        public void printI() {
          System.out.println(i);
        }

        @Override
        public void printJ() {
          System.out.println(j);
        }
      };

  public static void main(String[] args) {
    AnonymousInnerClass a = new AnonymousInnerClass();
    In inn = a.in;
    inn.printI();
    inn.printJ();
  }
}

interface In {
  void printI();

  void printJ();
}
