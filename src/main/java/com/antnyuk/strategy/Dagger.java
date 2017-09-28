package com.antnyuk.strategy;

public class Dagger implements Weapon {

    @Override
    public void attack(String name) {
        System.out.println(name + " stabbed with dagger");
    }

}
