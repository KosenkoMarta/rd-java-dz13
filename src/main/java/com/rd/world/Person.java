package com.rd.world;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }
    // (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)
    public abstract boolean isRetired();

    // (мається на увазі, що дружина приймає прізвище чоловіка)
    public abstract void registerPartnership(Person partner);


    // (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
    public abstract void deregisterPartnership();



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

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

}
