package beans;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 16.03.14
 * Time: 7:42
 * To change this template use File | Settings | File Templates.
 */
public class Manager implements Employee {
    private String name;

    public Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
