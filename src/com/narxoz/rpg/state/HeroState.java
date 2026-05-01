package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public interface HeroState {
    int modifyOutgoingDamage(Hero hero, int baseDamage);
    int modifyIncomingDamage(Hero hero, int damage);
    void onTurn(Hero hero);
    String getName();
}