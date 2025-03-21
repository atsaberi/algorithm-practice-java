package practice.algo.likedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsFromUnsortedLinkedList {

    private static Node<Integer> RemoveDupsFromUnsortedLinkedList(Node<Integer> head) {
        // TODO: check if the linkedlist has at least 2 nodes otherwise error or return itself

        Set<Integer> unique = new HashSet<>();
        Node<Integer> n = head;
        Node<Integer> prev = null;

        while (n != null) {
            if (unique.contains(n.data)) {
                prev.next = n.next;  // NOTE: in doubly linkedList always update both prev and current pointers
            } else {
                unique.add(n.data);
                prev = n;
            }
            n = n.next;
        }
        return head;
    }
}
