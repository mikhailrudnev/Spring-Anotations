package beans;

public class Designer implements Employee {
    private String name;

    public Designer() {
    }

    public Designer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "name='" + name + '\'' +
                '}';
    }
}
