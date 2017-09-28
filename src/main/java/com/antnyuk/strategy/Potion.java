package com.antnyuk.strategy;

public class Potion implements Item {

    @Override
    public void use(String name) {
        System.out.println(name + " used health potion");
    }
}
