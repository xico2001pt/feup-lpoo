import java.util.Objects;

public abstract class Person extends User implements Comparable<Person> {
    protected String name;
    protected int age;

    Person(String name) {
        this(name, 0);
    }

    Person(String name, int age) {
        super(name + age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}
