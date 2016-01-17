package eric.api;

import org.apache.log4j.Logger;

import java.util.Iterator;

/**
 * Created by root on 1/16/16.
 */
public class StackLinkedList<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private static Logger logger = Logger.getLogger(StackLinkedList.class);

    private class Node {
        Item item;
        Node next;

        Node(Item item) {
            this.item = item;
        }
    }

    public boolean isEmpty() { return N == 0; }

    public int size() { return N;}

    public void push(Item item) {
        Node node = new Node(item);
        N++;
        node.next = first;
        first = node;
    }

    public Item pop() {
        N--;
        Item item = first.item;
        first = first.next;
        return item;
    }

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node node = first;
            public boolean hasNext() {
                return node != null;
            }

            public Item next() {
                Item item = node.item;
                node = node.next;
                return item;
            }
        };
    }

    public static void main(String[] args) {
        StackLinkedList<String> stack = new StackLinkedList<String>();
        stack.push("shi");
        stack.push("chao");
        stack.push("ran");
        // traverse method 1 on iterable collection
        for(String str: stack)
            System.out.println(str);

        System.out.println();
        stack.pop();
        // traverse method 2 on iterable collection
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            logger.info(str);
        }
    }
}
