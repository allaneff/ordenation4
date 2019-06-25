public class Nodo <T> {


    private Nodo node;

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo getNode() {
        return node;
    }

    public void setNode(Nodo node) {
        this.node = node;
    }
}
