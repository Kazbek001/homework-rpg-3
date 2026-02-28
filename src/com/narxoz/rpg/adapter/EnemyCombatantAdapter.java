package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {
    private final Enemy enemy;
    private int health;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
        this.health = 80;
    }

    @Override
    public String getName() { return enemy.getName(); }

    @Override
    public int getHealth() { return health; }

    @Override
    public boolean isAlive() {
        return health >0;
    }

    @Override
    public void takeDamage(int damage) { this.health -= damage; }

    @Override
    public void attack(Combatant target) {
        System.out.println(getName() + " hit ");
        target.takeDamage(15);
    }
}