import java.util.Objects;

public class Element<T> {

    private final Element<T> parent;
    private final T data;

    public Element(Element<T> parent, T data) {

        Objects.requireNonNull(data);

        this.parent = parent;
        this.data = data;
    }

    public Element<T> getParent() {
        return parent;
    }

    public T getData() {
        return data;
    }
}
