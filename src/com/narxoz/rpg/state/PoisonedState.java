package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class PoisonedState implements HeroState {

    private int turns = 3;

    public int modifyOutgoingDamage(Hero hero, int baseDamage) {
        return baseDamage - 2;
    }

    public int modifyIncomingDamage(Hero hero, int damage) {
        return damage;
    }

    public void onTurn(Hero hero) {
        hero.takeDamage(2);
        turns--;

        if (turns <= 0) {
            hero.setState(new NormalState());
            System.out.println("Poison wore off");
        }
    }

    public String getName() {
        return "Poisoned";
    }
}