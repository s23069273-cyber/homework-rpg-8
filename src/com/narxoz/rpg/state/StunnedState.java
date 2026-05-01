package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class StunnedState implements HeroState {

    private int turns = 1;

    public int modifyOutgoingDamage(Hero hero, int baseDamage) {
        return 0;
    }

    public int modifyIncomingDamage(Hero hero, int damage) {
        return damage;
    }

    public void onTurn(Hero hero) {
        turns--;
        if (turns <= 0) {
            hero.setState(new NormalState());
        }
    }

    public String getName() {
        return "Stunned";
    }
}