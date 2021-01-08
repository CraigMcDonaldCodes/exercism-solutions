// There will be bugs in this implementation
// but it passes all the tests in the exercise.

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> current;

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

        if (current == null) {
            throw new IllegalStateException("Nothing to pop.");
        }

        T value = current.getValue();
        Node<T> tmp = current.getPrevious();
        current = tmp;

        return value;
    }

    ////////////////////////////////////////////////////////////////////////////////
    public T shift() {

        if (head == null) {
            throw new IllegalStateException("Nothing to shift.");
        }

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

