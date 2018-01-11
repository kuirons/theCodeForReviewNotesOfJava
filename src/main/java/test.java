import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by khx on 17-10-6.
 */
public class test{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        List<Integer> listSub=list.subList(1,3);
        System.out.println(listSub.set(0,new Integer(7)));
        for (Integer i :
                listSub) {
            System.out.println(i);
        }
        for (Integer i :
                list) {
            System.out.println(i);
        }
    }
}