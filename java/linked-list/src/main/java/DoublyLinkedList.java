public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> current;

    public DoublyLinkedList() {
    }

    ////////////////////////////////////////////////////////////////////////////////
    public void push(T value) {

        if (head == null) {
            head = new Node<T>(value);
            current = head;
        } else {
            var newNode = new Node<T>(value);
            newNode.setPrevious(current);
            current.setNext(newNode);
            current = newNode;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    public T pop() {

        // TODO Check for no head Node

        T value = current.getValue();
        Node<T> tmp = current.getPrevious();
        current = tmp;

        return value;
    }

    ////////////////////////////////////////////////////////////////////////////////
    public T shift() {

        // TODO Check for no head Node
        // TODO Check that we do have a next Node

        T value = head.getValue();
        Node<T> newHead = head.getNext();
        head = newHead;

        return value;
    }

    ////////////////////////////////////////////////////////////////////////////////
    public void unshift(T value) {

        var newHead = new Node<T>(value);
        newHead.setNext(head);

        if (head != null) {
            head.setPrevious(newHead);
        }
        head = newHead;

        if (current == null) {
            current = head;
        }
    }
}
