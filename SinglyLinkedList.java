public class SinglyLinkedList<E> {
    //Nested Node class
    public static class Node<E> {
        private E element;  //ref to the element stored at this node
        private Node<E> next;   //ref to the subsequent node in the list node

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return this.element;
        }

        public Node<E> getNextNode() {
            return this.next;
        }

        public void setNextNode(Node<E> n) {
            this.next = n;
        }

        //initializing the instance variables
        private Node<E> head = null;    //head node of the list
        private Node<E> tail = null;    //tail of the list
        public int size = 0;    //tracks how many nodes are in the list

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public E first() {   //returns the first element
            if (isEmpty())
                return null;
            return head.getElement();
        }

        public E last() {    //return the last element
            if (isEmpty())
                return null;
            return tail.getElement();
        }

        public void addFirst(E e) {  //adds element e to the front of the list
            head = new Node<>(e, head);  //creating and linking the new node
            if (size == 0)
                tail = head;  //special case: new node become tail also
            size++;
        }

        public void addLast(E e) {   //adds element e to the end of the list
            Node<E> newest = new Node<>(e, null);
            if (isEmpty())
                head = newest;  //special case: prev empty list
            else
                tail.setNextNode(newest);   //sets new node after an existing tail
            tail = newest;                  //new node becomes the tail
            size++;
        }

        public E removeFirst() {     //removes and returns the first element
            if (isEmpty())
                return null;
            E target = head.getElement();
            head = head.getNextNode();  //will become null if list had only one node
            size--;
            if (size == 0)
                tail = null;
            return target;

        }

        public void printList() {
            //initializing the variables
            Node<E> currentNode = head;
            //Validating
            while (currentNode != null) {
                System.out.println(currentNode.getElement());
                currentNode = currentNode.getNextNode();//updating the node order
            }
        }
    }
}
