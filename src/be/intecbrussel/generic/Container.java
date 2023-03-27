package be.intecbrussel.generic;

public class Container<E> {
    private String name;
    private E data;

    public Container(String name, E data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return name + ": " + data;
    }
}
