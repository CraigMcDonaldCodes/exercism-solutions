import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {

    private Element<T> currentElement;
    private int size;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public SimpleLinkedList() {

        currentElement = null;
        size = 0;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public SimpleLinkedList(T[] data) {

        size = 0;

        for (var d : data) {

            var newElement = new Element<T>(currentElement, d);
            currentElement = newElement;
            size++;
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public T pop() {

        if (size == 0) { throw new NoSuchElementException(); }

        var poppedElement = currentElement;
        var parentElement = currentElement.getParent();
        currentElement = parentElement;
        size--;

        return poppedElement.getData();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int size() {

        return size;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void push(T item) {

        var newElement = new Element(currentElement, item);
        currentElement = newElement;
        size++;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void reverse() {

        Element<T> newHeadElement = null;

        while (size > 0) {
            newHeadElement = new Element<T>(currentElement, pop());
        }

        currentElement = newHeadElement;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public T[] asArray(Class itemClass) {
        return null;
    }
}
