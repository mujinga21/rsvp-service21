package com.company;

public class Farmer extends  Character {

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

    public String plow(){
     System.out.println("farmer plough crops");
     return plow();
 }
 public void harvest(){
     System.out.println("harvest in season");
 }
}
