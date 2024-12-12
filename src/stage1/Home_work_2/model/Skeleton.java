package stage1.Home_work_2.model;

public class Skeleton extends Enemy{
    private String name = "Скелет";
    private int skeletonCount = 0;

    public Skeleton(int health){
        super(health);
        skeletonCount++;
        setName(name + skeletonCount);
    }
    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
    }
    @Override
    public void attackHero(Hero hero){
        if (!isAlive()){
            return;
        }
        int damage = 3;
        System.out.println(getName() + " бьёт " + hero.getName());
        hero.takeDamage(damage);
        poison(hero);
    }

    public void poison(Hero hero){
        if (Math.random() < 0.2){
            System.out.println(getName() + " накладывает отравление на " + hero.getName() + " на 2 раунда.");
            hero.poison(2);
        }
    }
}
