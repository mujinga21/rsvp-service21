package com.company;

public class Warrior extends Character{

    private  int shieldStrength;

    public void setShieldStrength(){
        System.out.println("Shiedls");
    }


    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }
}

