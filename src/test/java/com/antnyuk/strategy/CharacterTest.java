package com.antnyuk.strategy;


import org.junit.Test;


public class CharacterTest {

    @Test
    public void characterTest1() {

        Character char1 = new Character("Brian", new Sword(), new Shield());

        char1.attack();
        char1.useItem();

        Character char2 = new Character("Jimmy" , new Dagger(), new Potion());
        char2.attack();
        char2.useItem();
    }

}