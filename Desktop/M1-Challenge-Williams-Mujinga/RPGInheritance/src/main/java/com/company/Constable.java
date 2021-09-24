package com.company;

public class Constable extends Character {

    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

    public void arrest(){
    System.out.println("has the ability to arrest");
}
}
