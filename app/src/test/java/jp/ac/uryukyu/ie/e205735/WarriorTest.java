package jp.ac.uryukyu.ie.e205735;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorAttack = 10;
        int nowSlimeHP = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", nowSlimeHP, 10);

        for(int i=0; i<3; i++){
        demoWarrior.attackWithWeponSkill(slime);
        slime.attack(demoWarrior);
        assertEquals(nowSlimeHP - slime.hitPoint, defaultWarriorAttack * 1.5);
        nowSlimeHP = slime.hitPoint;
        }
    }
}
