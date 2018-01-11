/**
 * Created by khx on 17-10-9.
 */
public class InnerClass {
    private Object[] items;
    private int next=0;
    public InnerClass(int size){
        items=new Object[size];
    }
    class SequenceSelector implements Selector{
        private int i=0;
        public boolean end(){
            return i==items.length;
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if(i< items.length){
                i++;
            }
        }
    }
    public void add(Object o){
        if(next<items.length){
            items[next++]=o;
        }
    }

//    public Selector getSelector(){
//        return new SequenceSelector();
//    }
    public static void main(String[] args) {
        InnerClass t=new InnerClass(10);
        for (int i = 0; i < 10; i++) {
            t.add(Integer.toString(i));
        }
        Selector s=(new InnerClass(10)).new SequenceSelector();
        while(!s.end()){
            System.out.println(s.current());
            s.next();
        }
    }
}
interface Selector{//接口的所有对象默认被设置位public的
    void next();
    Object current();
    boolean end();
}