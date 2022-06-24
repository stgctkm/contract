package consumer.domain.model;

public class User {
    String firstName;
    String lastName;
    Integer age;

    public User() {
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public Integer age() {
        return age;
    }

}
