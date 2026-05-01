package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.*;
import java.util.*;

public class BattleFloor extends TowerFloor {

    protected String getFloorName() {
        return "Battle Floor";
    }

    protected void setup(List<Hero> heroes) {
        System.out.println("Monster appears!");
    }

    protected FloorResult resolveChallenge(List<Hero> heroes) {

        Hero hero = heroes.get(0);
        Monster monster = new Monster(30, 8);

        while (hero.getHp() > 0 && monster.getHp() > 0) {

            hero.onTurn();

            monster.takeDamage(hero.attack());

            if (monster.getHp() > 0) {
                hero.takeDamage(monster.attack());
            }
        }

        return new FloorResult(hero.getHp() > 0, 10, "Monster defeated");
    }

    protected void awardLoot(List<Hero> heroes, FloorResult result) {
        System.out.println("Battle reward given");
    }
}