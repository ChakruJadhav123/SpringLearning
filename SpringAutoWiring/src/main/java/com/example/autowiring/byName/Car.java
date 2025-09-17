package com.example.autowiring.byName;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void getDetails(){

        System.out.println(specification.toString());
    }

}
