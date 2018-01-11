/**
 * Created by khx on 17-10-21.
 */
public class MNA {
    private void f(){
        System.out.printf("f");
    };
    class A{
        private void g(){
            System.out.printf("g");
        };
        public class B{
            void h(){
                g();
                f();
            }
        }
    }

    public static void main(String[] args) {
        MNA mna=new MNA();
        A mnaa=mna.new A();
        A.B mnaab=mnaa.new B();
        mnaab.h();
    }
}
