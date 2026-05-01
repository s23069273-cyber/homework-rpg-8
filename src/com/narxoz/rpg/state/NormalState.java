package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class NormalState implements HeroState {

    public int modifyOutgoingDamage(Hero hero, int baseDamage) {
        return baseDamage;
    }

    public int modifyIncomingDamage(Hero hero, int damage) {
        return damage;
    }

    public void onTurn(Hero hero) {
        if (hero.getHp() < 30) {
            hero.setState(new RageState());
            System.out.println("Hero enters RAGE!");
        }
    }

    public String getName() {
        return "Normal";
    }
}