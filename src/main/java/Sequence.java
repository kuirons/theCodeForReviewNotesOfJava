/**
 * @author WuGYu
 * @date 2018/1/11 16:30
 */
public class Sequence {
  private Object[] items;
  private int next = 0;

  public Sequence(int size) {
    items = new Object[size];
  }

  private class SequenceSelector implements Selector {
    private int i = 0;

    @Override
    public boolean end() {
      return i == items.length;
    }

    @Override
    public Object current() {
      return items[i];
    }

    @Override
    public void next() {
      if (i < items.length) i++;
    }
  }
  
  public SequenceSelector getSequence(){
      return new SequenceSelector();
  }
  
  public void add(Object o){
      if(next < items.length)
          items[next++] = o;
  }

  public static void main(String[] args) {
      Sequence sequence = new Sequence(20);
    for (int i = 0; i < 20; i++) {
        sequence.add(Integer.toString(i));
    }
    SequenceSelector selector = sequence.getSequence();
    while (!selector.end()) {
      System.out.println(selector.current());
      selector.next();
    }
  }
}

interface Selector {
  boolean end();

  Object current();

  void next();
}
