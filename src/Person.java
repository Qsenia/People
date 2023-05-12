import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;


    }

    public int happyBirthday() {
        //Если возраст человека известен, то с момента создания объекта он может быть изменён
        // только увеличением на единицу через вызов метода happyBirthday().
        if (age != 0) {
            return age + 1;
        } else {
            return age;
        }
    }

    public boolean hasAge() {
        // Возраст человека может быть неизвестен, в этом случае метод boolean hasAge()
        // должен вернуть false, иначе - true.
        if (age < 0) {
            return false;
        }
        return true;
    }

    boolean hasAddress() {
        //должен вернуть true, иначе - false)
        if (city != null) {
            return true;
        }
        return false;
    }

    public void setAddress(String city) {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder();

        person.setName(name);
        person.setSurname(surname);
        person.setAge(0);
        person.setCity(city);
        return person;
    }

}
