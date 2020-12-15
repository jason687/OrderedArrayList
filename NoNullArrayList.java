import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;

  public NoNullArrayList () {
    super();
  }

  public NoNullArrayList (int a) {
    super(a);
  }

  public boolean add (T thing) {
    if (thing == null) {
      throw new IllegalArgumentException ("No nulls!");
    } else {
      super.add(thing);
    }
    return true;
  }

  public void add (int index, T thing) {
    if (thing == null) {
      throw new IllegalArgumentException ("No nulls!");
    } else {
      super.add(index, thing);
    }
  }

  public T set (int index, T thing) {
    if (thing == null) {
      throw new IllegalArgumentException ("No nulls!");
    }
    return super.set(index, thing);
  }
}
