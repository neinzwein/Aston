package Home_work_2.model;

public class Zombie extends Enemy{
    private static int zombieCount = 0;
    private String name = "Зомби";

    public Zombie(int health){
        super(health);
        zombieCount++;
        setName(name + zombieCount);
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
        if (!isAlive() && Math.random() < 0.2) {
            relife();
        }
    }

    private void relife(){
        System.out.println("Воскрешение зомби");
        setHealth(100);
    }

    @Override
    public void attackHero(Hero hero){
        if (!isAlive()){
            return;
        }
        int damage = 5;
        System.out.println(getName() + " бьёт " + hero.getName());
        hero.takeDamage(damage);
    }

}
