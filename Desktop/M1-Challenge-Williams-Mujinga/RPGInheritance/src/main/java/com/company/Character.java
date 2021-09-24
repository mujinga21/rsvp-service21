package com.company;

public class Character {
    private String name;
    private int Strength;
    private int health;
    private int stamina;
    private int speed;
    private  int attackPower;

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        Strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void run() {
        System.out.println("characters can run");
    }
    public void attack(){
        System.out.println("characters can attack");
    }
    public void heal(){
        System.out.println("character are able to heal");
    }
    public void decreaseHealth (){
        System.out.println("character health can decrease");
    }
    public void decreaseStamina(){
        System.out.println("can decrease stamina");
    }
    public void increaseStamina(){
        System.out.println("can increase stamina");
    }
}
