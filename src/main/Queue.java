package main;

public class Queue {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        private Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private int size = 0;
    private Node front = null;
    private Node rear = null;

    private void enqueue(int data){
        Node node = new Node(data,null);
        if(this.front == null && this.rear == null){
            this.front = this.rear = node;
        }
        this.rear.setNext(node);
        this.rear = node;
        this.size++;
    }

    public void copy(){
        Node curr = this.front;
        Node prev = null;
        Node next;

        while (curr != null){

        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(9);
        System.out.println(queue);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");

        Node temp = this.front;

        while(temp != null){
            result.append(temp.getData());

            if(temp.getNext() !=  null){
                result.append("-->");
            }
            temp = temp.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
