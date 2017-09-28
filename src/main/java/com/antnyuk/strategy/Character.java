package com.antnyuk.strategy;

public class Character {

    Weapon weapon;
    Item item;
    String name;

    public Character(String name, Weapon weapon, Item item) {
        this.name=name;
        this.weapon = weapon;
        this.item = item;
    }

    public void attack() {
        weapon.attack(name);
    }

    public void useItem() {
        item.use(name);
    }

}
