package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Profile {
    private Address address;
    private Employee employee;

    public Profile() {
    }

    public Profile(Address address, Employee employee) {
        this.address = address;
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Resource(name="designer")
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "address=" + address +
                ", employee=" + employee +
                '}';
    }
}
