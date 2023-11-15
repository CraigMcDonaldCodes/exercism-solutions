import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {

    private Element<T> currentElement;
    private int size;

    public SimpleLinkedList() {

        currentElement = null;
        size = 0;
    }

    public SimpleLinkedList(T[] data) {

        size = 0;

        for (var d : data) {

            var newElement = new Element<T>(currentElement, d);
            currentElement = newElement;
            size++;
        }
    }

    public T pop() {

        if (size == 0) { throw new NoSuchElementException(); }

        var poppedElement = currentElement;
        var parentElement = currentElement.getParent();
        currentElement = parentElement;
        size--;

        return poppedElement.getData();
    }

    public int size() {

        return size;
    }

    public void push(T item) {

        var newElement = new Element(currentElement, item);
        currentElement = newElement;
        size++;
    }

    public void reverse() {

        // No idea if this is a good solution
        // feels like there is a better way

        Element<T> newHeadElement = null;
        int newSize = 0;

        while (size > 0) {
            newHeadElement = new Element<T>(newHeadElement, pop());
            newSize++;
        }

        currentElement = newHeadElement;
        size = newSize;
    }

    public T[] asArray(Class itemClass) {

        // No idea why they want to pass in the `Class` param

        var list = new ArrayList<T>();
        var element = currentElement;

        while (element != null) {
            list.add(element.getData());
            element = element.getParent();
        }

        // Ugly cast, not sure if a better way
        return (T[]) list.toArray();
    }
}
