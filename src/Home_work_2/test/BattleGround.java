package Home_work_2.test;

import Home_work_2.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {

        Hero hero = new Warrior("Воин");

        List<Enemy> group = new ArrayList<>();
        group.add(new Zombie(100));
        group.add(new Zombie(40));
        group.add(new Skeleton(20));

        Random random = new Random();

        while (hero.isAlive() && !group.isEmpty()){
            Enemy choose = group.get(random.nextInt(group.size()));
            hero.attackEnemy(choose);

            if (!choose.isAlive()){
                group.remove(choose);
            }

            for (Enemy enemy : group){
                if (enemy.isAlive()){
                    enemy.attackHero(hero);
                }
                if (hero.isAlive() && enemy instanceof Skeleton){
                    hero.PoisonEffect();
                }
                if (!hero.isAlive()){
                    System.out.println("Поражение");
                    break;
                }
            }
            if (group.isEmpty()) {
                System.out.println("Победа");
            }
        }

    }
}
