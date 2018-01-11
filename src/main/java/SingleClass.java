/**
 * Created by khx on 17-10-10.
 */
import static sun.java2d.cmm.ColorTransform.In;

/**
 * Created by khx on 17-10-10.
 */
public class SingleClass {
    public static void getFS(Factory fc){
        Service s=fc.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        SingleClass.getFS(ServiceFactory1.factory);
        SingleClass.getFS(ServiceFactory2.factory);
    }
}

interface Service{
    void method1();
    void method2();
}
interface Factory{
    Service getService();
}

class ServiceFactory1 implements Service{
    @Override
    public void method1() {
        System.out.println("ServiceFarory1.method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceFarory1.method2");
    }

    private ServiceFactory1(){}

    public static Factory factory= () -> new ServiceFactory1();
}

class ServiceFactory2 implements Service{
    @Override
    public void method1() {
        System.out.println("ServiceFarory2.method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceFarory2.method2");
    }

    private ServiceFactory2(){}

    public static Factory factory= () -> new ServiceFactory2();
}