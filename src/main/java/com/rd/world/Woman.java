package com.rd.world;

public class Woman extends Person{
    private String maidenName;
    private final int retirementAge = 60;

    public Woman(String firstName, String lastName, int age, Person partner, String maidenName) {
        super(firstName, lastName, age, partner);
        this.maidenName = maidenName;
    }

    @Override
    public boolean isRetired() {
        return getAge() >= retirementAge;
    }


    @Override
    public void registerPartnership(Person man) {
        if (this.getPartner() != null) {
            System.out.println("Already registered partnership.");
            return;
        }
        if (man instanceof Man) {
            this.setLastName(man.getLastName());
        }
        this.setPartner(man);
    }

    @Override
    public void deregisterPartnership() {
        if (getAge() >= retirementAge) {
            System.out.println("Cannot deregister partnership as age is less than or equal to 60.");
            return;
        }
        if (this.getPartner() != null) {
            this.setLastName(this.getMaidenName());
            this.setPartner(null);
        } else {
            System.out.println("No partnership to deregister.");
        }
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }
}
