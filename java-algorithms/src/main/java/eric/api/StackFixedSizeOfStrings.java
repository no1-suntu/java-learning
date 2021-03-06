package eric.api;

/**
 * Created by root on 1/15/16.
 */
public class StackFixedSizeOfStrings {
    private String[] a;
    private int N;

    public StackFixedSizeOfStrings(int size) {
        a = new String[size];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }
}
