package Home_work_2.model;

public class Warrior extends Hero{
    private int armor = 2;

    public Warrior(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (!isAlive()){
            return;
        }
        int damage = 10;
        System.out.println(getName() + " бьёт мечом " + enemy.getName());
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        damage -= armor;
        damage = blockDamage(damage);
        super.takeDamage(damage);
    }

    private int blockDamage(int damage){
        if (Math.random() < 0.4){
            System.out.println("Урон заблокирован");
            return 0;
        }
        return damage;
    }
}
