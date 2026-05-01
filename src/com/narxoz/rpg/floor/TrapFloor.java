package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.*;
import com.narxoz.rpg.state.*;
import java.util.*;

public class TrapFloor extends TowerFloor {

    protected String getFloorName() {
        return "Trap Floor";
    }

    protected void setup(List<Hero> heroes) {
        System.out.println("It's a trap!");
    }

    protected FloorResult resolveChallenge(List<Hero> heroes) {

        Hero hero = heroes.get(0);

        hero.takeDamage(15);
        hero.setState(new PoisonedState());

        return new FloorResult(hero.getHp() > 0, 0, "Trap triggered");
    }

    protected void awardLoot(List<Hero> heroes, FloorResult result) {
        System.out.println("No loot here");
    }
}