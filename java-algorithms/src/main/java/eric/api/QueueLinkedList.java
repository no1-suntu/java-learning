package eric.api;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by root on 1/16/16.
 */
public class QueueLinkedList<Item> implements Iterable<Item> {
    private Node rear;
    private Node head;
    private int N;

    public boolean isEmpty() { return N == 0;}

    public int size() { return N; }

    public void enqueue(Item item) {
        Node node = new Node(item);
        if(N == 0) {
            rear = node;
            head = rear;
            N++;
            return;
        }
        rear.next = node;
        rear = node;
        N++;
    }

    public Item dequeue() {
        N--;
        Item item = head.item;
        head = head.next;
        if(isEmpty()) rear = null;
        return item;
    }

    private class Node {
        Item item;
        Node next;

        Node(Item item) {
            this.item = item;
        }
    }
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node node = head;
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

    @Test
    public void testA() {
        QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        for(Integer i: queue)
            System.out.println(i);
    }

    //@Test
    public void testB() {
        QueueLinkedList<String> queue = new QueueLinkedList<String>();
        queue.enqueue("shi");
        queue.enqueue("chao");
        queue.enqueue("ran");
        for(String str: queue)
            System.out.println(str);
    }
}
