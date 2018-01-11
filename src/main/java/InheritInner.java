/**
 * Created by khx on 17-10-22.
 */
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        //当父类是一个内部类的时候，需要通过内部类的外部类的实例来调用父类的构造函数
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner(wi);
    }
}

class WithInner{
    class Inner{
        Inner(){
            System.out.println("调用内部类构造函数");
        }
    }
}
