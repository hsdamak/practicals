package main;

public class SinglyLinkedList {

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


        private Node head =null;
        private int size = 0;

        public void insertHead(int data) {           // helper method
            this.head = new Node(data, this.head);
        }

        public void insertAfter(int data, Node node){  //helper method
            node.setNext(new Node(data,node.getNext()));
        }

        public void insert(int data){
            if(this.head == null){
                insertHead(data);

            }else{
                Node temp = this.head;

                while(temp.getNext() != null){

                    temp = temp.getNext();

                            }
                insertAfter(data,temp);

            }

        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("[");
            Node temp = this.head;
            while(temp != null){
                result.append(temp.getData());
                if(temp.getNext() != null){
                    result.append("-->");
                }
                temp = temp.getNext();
            }
            result.append("]");
            return result.toString();
        }

        public void reverse(){
            Node curr = this.head;
            Node prev = null;
            Node next;
            while(curr != null){

                next=curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            this.head = prev;
        }



    public static void main(String[] args) {
        SinglyLinkedList singly = new SinglyLinkedList();
        System.out.println(singly);

        singly.insert(1);
        singly.insert(3);
        singly.insert(5);
        System.out.println(singly);
        singly.reverse();
        System.out.println(singly);

    }
}
