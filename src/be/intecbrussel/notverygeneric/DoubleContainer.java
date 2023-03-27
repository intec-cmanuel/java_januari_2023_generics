package be.intecbrussel.notverygeneric;

public class DoubleContainer {
    private String name;
    private double data;

    public DoubleContainer(String name, double data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public double getData() {
        return data;
    }

    @Override
    public String toString() {
        return name + ": " + data;
    }
}
