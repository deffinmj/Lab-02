import java.time.Year;

public class Person {
    String id;
    String firstName;
    String lastName;
    String title;
    int yearOfBirth;

    public Person() {

    }

    public Person(String id, String firstName, String lastName, String title, int YOB) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = YOB;
    }


    public String fullName() {
        return firstName + " " + lastName;
    }
    public String formalName() {
        return title + " " + fullName();
    }
    public String getAge() {
        return Integer.toString(Year.now().getValue() - yearOfBirth);
    }
    public String getAge(int year) {
        return Integer.toString(year - yearOfBirth);
    }

    public String toCSVDataRecord() {
        return id + "," + firstName + "," + lastName + "," + title + "," + Integer.toString(yearOfBirth);
    }

}