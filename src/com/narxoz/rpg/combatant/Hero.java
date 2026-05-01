package com.narxoz.rpg.combatant;

import com.narxoz.rpg.state.*;

public class Hero {

    private int hp = 100;
    private int baseDamage = 10;
    private HeroState state = new NormalState();

    public int attack() {
        return state.modifyOutgoingDamage(this, baseDamage);
    }

    public void takeDamage(int damage) {
        int finalDamage = state.modifyIncomingDamage(this, damage);
        hp -= finalDamage;
        System.out.println("Hero takes " + finalDamage + " damage. HP: " + hp);
    }

    public void onTurn() {
        state.onTurn(this);
    }

    public void setState(HeroState state) {
        this.state = state;
    }

    public int getHp() {
        return hp;
    }
}