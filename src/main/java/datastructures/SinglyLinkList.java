package datastructures;

import java.util.ArrayList;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class SinglyLinkList {
    private Node head;
    private Node tail;

    public SinglyLinkList() {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        Node cur = head.next;
        int i = 0;
        while (i != index) {
            if (i == index) {
                return cur.val;
            }
            cur = cur.next;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node next = head;
        next.val = val;
        head.next = null;

    }

    public void insertTail(int val) {
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        Node cur = this.head;
        int i = 0;

        while (i < index && cur.next != null) {
            cur = cur.next;
            i++;
        }

        if (cur != null && cur.next != null) {
            if (cur.next == tail) {
                this.tail = cur;
            }
            cur.next = cur.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node cur = head.next;
        while (cur != null) {
            values.add(cur.val);
            cur = cur.next;
        }
        return values;
    }

    @Override
    public String toString() {
        String string = "";
        Node next = head;
        while (next != null) {
            next = next.next;
            string += next.val + ",";
        }

        return string;
    }
}
