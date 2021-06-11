public class CircularBuffer<T> {

    private static final String MSG_BUFFER_FULL = "Tried to write to full buffer";
    private static final String MSG_BUFFER_EMPTY = "Tried to read from empty buffer";

    private int size;
    private T buffer[];
    private int readPos;
    private int writePos;

    @SuppressWarnings("unchecked")
    public CircularBuffer(int size) {

        readPos = 0;
        writePos = 0;
        this.size = size;
        buffer = (T[])new Object[size];
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        buffer = (T[])new Object[size];
    }

    public void overwrite(T value) {

    }

    public T read() throws BufferIOException {

        T value = buffer[readPos];

        if (value == null) {
            throw new BufferIOException(MSG_BUFFER_EMPTY);
        }

        buffer[readPos] = null;
        readPos = (readPos + 1) % buffer.length;

        return value;
    }

    public void write(T value) throws BufferIOException {

        T currentValue = buffer[writePos];

        if (currentValue != null) {
            throw new BufferIOException(MSG_BUFFER_FULL);
        } else {
            buffer[writePos] = value;
            writePos = (writePos + 1) % buffer.length;
        }
    }
}
