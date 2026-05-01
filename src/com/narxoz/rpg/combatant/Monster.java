package com.narxoz.rpg.combatant;

public class Monster {

    private int hp;
    private int damage;

    public Monster(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
        System.out.println("Monster takes " + dmg + " damage. HP: " + hp);
    }

    public int getHp() {
        return hp;
    }
}