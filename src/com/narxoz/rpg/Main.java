package com.narxoz.rpg;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.floor.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();
        List<Hero> heroes = new ArrayList<>();
        heroes.add(hero);

        TowerFloor[] floors = {
                new BattleFloor(),
                new HealingFloor(),
                new TrapFloor(),
                new BattleFloor()
        };

        for (TowerFloor floor : floors) {

            FloorResult result = floor.explore(heroes);

            if (!result.isSuccess()) {
                System.out.println("Hero died!");
                return;
            }
        }

        System.out.println("Tower cleared!");
    }
}