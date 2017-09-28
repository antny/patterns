package com.antnyuk.strategy;

public class Shield implements Item {

    @Override
    public void use(String name) {
        System.out.println(name + " defended with sheild");
    }
}
