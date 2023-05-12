public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Вы ввели неприемлемое значение возраста:" + age);
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalArgumentException("Вы не ввели имя! Введите имя!");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Вы не ввели фамилию! Введите фамилию!");
        }
        Person person;
        if (age < 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (city != null) {
            person.setCity(city);

        }
        return person;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }
}
