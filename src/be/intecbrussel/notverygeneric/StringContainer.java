package be.intecbrussel.notverygeneric;

public class StringContainer {
    private String name;
    private String data;

    public StringContainer(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return name + ": " + data;
    }


}
