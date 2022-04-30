public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть минусовым, введите корректное значение");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person = new Person(name, surname, age, address);
        if (name == null) {
            throw new IllegalStateException("Не задано имя(name)");
        } else if (surname == null) {
            throw new IllegalStateException("Не задана фамилия(surname)");
        } else {
            return person;
        }
    }
}
