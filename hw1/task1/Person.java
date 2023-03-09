package hw1.task1;

public class Person {
    private enum Sex {
        man, woman, none
    }

    private String fullName;
    public Person(String fullName) {
        this(fullName, Sex.none);
    }

    public Person(String fullName, Sex sex) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}
