import java.util.ArrayList;

public class OrderedArrayList <T extends Comparable <T>> extends NoNullArrayList <T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int index) {
    super(index);
  }

  public boolean add (T thing) {
    super.add(thing);
    sorter();
    return true;
  }

  public void sorter () {
    ArrayList<T> a = new ArrayList<T> ();
    for (int i = 0; i < size(); i++) {
      a.add(get(i));
    }
    clear();
    T minimum = a.get(0);
    boolean first = true;
    for (int j = 0; j < a.size(); j++) {
      for (int i = 0; i < a.size(); i++) {
        if (first) {
          minimum = a.get(i);
          first = false;
        } else {
          if ((a.get(i)).compareTo(minimum) < 0) {
            minimum = a.get(i);
          }
        }
      }
      super.add(minimum);
      first = true;
      a.remove(minimum);
      j -= 1;
    }
  }
}
