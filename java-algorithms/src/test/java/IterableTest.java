import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

import java.util.Iterator;

/**
 * Created by root on 1/15/16.
 */
public class IterableTest<Item> implements Iterable<Item> {
    private static Logger logger = Logger.getLogger(IterableTest.class);
    private Item[] items;
    private int size;

    public IterableTest(int size) {
        items = (Item[]) new Object[size];
    }

    public void push(Item item) {
        items[size++] = item;
    }

    public Item pop() {
        return items[--size];
    }

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            int i = size;
            public boolean hasNext() {
                return i > 0;
            }

            public Item next() {
                return items[--i];
            }
        };
    }

    public static void main(String[] args) {
        IterableTest<String> iter = new IterableTest<String>(10);
        iter.push("shi");
        iter.push("chao");
        iter.push("ran");
        for(String str: iter)
            logger.info(str);
    }
}
