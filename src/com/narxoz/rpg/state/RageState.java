package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class RageState implements HeroState {

    public int modifyOutgoingDamage(Hero hero, int baseDamage) {
        return baseDamage * 2;
    }

    public int modifyIncomingDamage(Hero hero, int damage) {
        return damage + 2;
    }

    public void onTurn(Hero hero) {
        hero.setState(new NormalState());
    }

    public String getName() {
        return "Rage";
    }
}