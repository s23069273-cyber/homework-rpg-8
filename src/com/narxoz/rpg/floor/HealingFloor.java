package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.*;
import java.util.*;

public class HealingFloor extends TowerFloor {

    protected String getFloorName() {
        return "Healing Floor";
    }

    protected void setup(List<Hero> heroes) {
        System.out.println("Healing fountain!");
    }

    protected FloorResult resolveChallenge(List<Hero> heroes) {

        Hero hero = heroes.get(0);
        hero.takeDamage(-20);

        return new FloorResult(true, 5, "Healed");
    }

    protected void awardLoot(List<Hero> heroes, FloorResult result) {
        System.out.println("No loot, just heal");
    }
}