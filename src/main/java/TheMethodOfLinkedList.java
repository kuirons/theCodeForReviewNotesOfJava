import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by khx on 17-10-23.
 */
public class TheMethodOfLinkedList {
    private LinkedList<Integer> linkedList;

    TheMethodOfLinkedList(){
        linkedList=new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedListTest=new LinkedList<>();
        linkedListTest.add(new Integer(3));
        linkedListTest.add(new Integer(4));
        TheMethodOfLinkedList m=new TheMethodOfLinkedList();
        m.linkedList.add(new Integer(1));
        m.linkedList.add(new Integer(2));
        System.out.println(m.linkedList.toString());
        m.linkedList.addAll(linkedListTest);
        System.out.println(m.linkedList.toString());
        m.linkedList.retainAll(linkedListTest);
        System.out.println(m.linkedList.toString());
        m.linkedList.addAll(0,linkedListTest);
        System.out.println(m.linkedList.toString());
        m.linkedList.remove(new Integer(3));
        System.out.println(m.linkedList.toString());
        m.linkedList.remove(new Integer(4));
        System.out.println(m.linkedList.toString());
        m.linkedList.addAll(1,linkedListTest);
        System.out.println(m.linkedList.toString());
        m.linkedList.addFirst(new Integer(2));
        System.out.println(m.linkedList.toString());
        m.linkedList.addFirst(new Integer(1));
        System.out.println(m.linkedList.toString());
        m.linkedList.addLast(new Integer(5));
        System.out.println(m.linkedList.toString());
        System.out.println(m.linkedList.contains(new Integer(5)));
        System.out.println(m.linkedList.contains(new Integer(6)));
        Iterator descendingIterator=m.linkedList.descendingIterator();
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
        Iterator iterator=m.linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(m.linkedList.getFirst());
        System.out.println(m.linkedList.getLast());
        m.linkedList.offer(new Integer(0));
        System.out.println(m.linkedList.toString());
        System.out.println(m.linkedList.peek());
        System.out.println(m.linkedList.poll());
        System.out.println(m.linkedList.toString());
        System.out.println(m.linkedList.pop());
        System.out.println(m.linkedList.toString());
        m.linkedList.push(new Integer(1));
        m.linkedList.set(1,new Integer(2));
        System.out.println(m.linkedList.toString());
        for (Object i :
                m.linkedList.toArray()) {
            System.out.println(i);
        }
        for (Integer i :
                m.linkedList.subList(1, 3)) {
            System.out.println(i);
        }
        System.out.println("flag:"+m.linkedList.indexOf(new Integer(4)));
    }
}
