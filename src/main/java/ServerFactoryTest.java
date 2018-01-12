/**
 * @author WuGYu
 * @date 2018/1/11 17:30
 */
public class ServerFactoryTest {
  static int test = 1;
  public static void main(String[] args) {
    Test.factory.factory().method();
    ServerFactoryTest sft = new ServerFactoryTest();
    System.out.println(sft.test);
  }
}

interface server{
  void method();
}
interface serverFactory{
  server factory();
}

class Test implements server{
  private Test(){}

  @Override
  public void method() {
    System.out.println("嘿嘿嘿~~~~~~");
  }

  public static serverFactory factory = new serverFactory() {
    @Override
    public server factory() {
      return new Test();
    }
  };
}