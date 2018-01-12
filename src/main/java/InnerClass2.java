/**
 * @author WuGYu
 * @date 2018/1/11 16:04
 */
public class InnerClass2 {
  class Contens {
    private int i = 11;

    public int value() {
      return i;
    }
  }

  class Destination {
    private String lable;

    Destination(String whereTo) {
      this.lable = whereTo;
    }

    public String getLable() {
      return lable;
    }
  }

  public void ship(String dest) {
    Contens c = new Contens();
    Destination d = new Destination(dest);
    System.out.println(d.getLable());
  }

  public static void main(String[] args) {
      InnerClass2 i = new InnerClass2();
      i.ship("测试");
  }
}
