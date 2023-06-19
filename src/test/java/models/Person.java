package models;

import com.opencsv.bean.CsvBindByName;

public class Person {
    @CsvBindByName(column = "id")
    private int id;
    @CsvBindByName(column = "firstname")
    private String firstName;
    @CsvBindByName(column = "lastname")
    private String lastName;
    @CsvBindByName(column = "age")
    private int age;
    @CsvBindByName(column = "gender")
    private String gender;

    public Person(int id, String firstName, String lastName, int age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
