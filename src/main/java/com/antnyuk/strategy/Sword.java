package com.antnyuk.strategy;

public class Sword implements Weapon {

    @Override
    public void attack(String name) {
        System.out.println(name + " swung sword");
    }

}
