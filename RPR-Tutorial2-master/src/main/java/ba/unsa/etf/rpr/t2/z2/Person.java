package ba.unsa.etf.rpr.t2.z2;

import java.util.Objects;

/**
 * POJO class for person
 * @author Hana Mahmutović
 */
public class Person {

    private String name;
    private String lastName;

    public String getIme() {
        return name;
    }

    public void setIme(String ime) {
        this.name = ime;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last name='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    public Person(String name, String LastName) {
        this.name = name;
        this.lastName = LastName;
    }
}