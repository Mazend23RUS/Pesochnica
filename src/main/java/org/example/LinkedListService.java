package org.example;

public class LinkedListService {
    Node first = new Node();
    Node last = new Node();


    public static class Node {
        private Node next;
        private String value;
        private Node prev;

        public Node(Node next, String value, Node prev) {
            this.next = next;
            this.value = value;
            this.prev = prev;
        }

        public Node(){}
    }


    public void printAllNodes() {
        Node nextNode = first.next;

        while (nextNode != null) {
            System.out.print(nextNode.value);
            System.out.println();
            nextNode = nextNode.next;
        }
    }

    public void addNode(String one) {
        Node newNode = new Node();

        if (first.next == null && last.next == null) {
            first.next = newNode;
            newNode.value = one;
            newNode.prev = first;
            newNode.next = last;
            last.prev = newNode;
        } else {
//            last.prev.next = newNode;
            last.next = newNode;
//            first.next = newNode;
            newNode.value = one;
            newNode.next = last.prev;
//            newNode.prev = first.next.prev;
        }



    }


}
