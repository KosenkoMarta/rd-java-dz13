package com.rd.world;

public class Man extends Person {
    private final int retirementAge = 65;

    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return getAge() >= retirementAge;

    }

    @Override
    public void registerPartnership(Person woman){
        if (this.getPartner() != null) {
            System.out.println("Already registered partnership.");
            return;
        }
        this.setPartner(woman);
    }

    @Override
    public void deregisterPartnership() {
        if (getAge() >= retirementAge) {
            System.out.println("Cannot deregister partnership as age is less than or equal to 65.");
            return;
        }
        if (this.getPartner() != null) {
            this.setPartner(null);
        } else {
            System.out.println("No partnership to deregister.");
        }
    }


}
