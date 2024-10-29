package Home_work_2.model;

abstract public class Hero implements Mortal{
    private String name;
    private int health = 100;
    private int poisonRound = 0;

    public Hero(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth(){
        return health;
    }

    public boolean isAlive(){
        if (health > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void takeDamage(int damage){
        if (health < damage){
            damage = health;
        }
        health -= damage;
        System.out.println(name + " Получает урон: " + damage + "\nОставшееся здоровье: " + health + "\n");
    }
    public void PoisonEffect(){
        if (poisonRound > 0){
            int poisonDamage = 8;
            if (poisonDamage > health){
                poisonDamage = health;
            }
            health -= poisonDamage;
            poisonRound--;
            System.out.println(name + " получает " + poisonDamage + " урона от отравления. Оставшееся здоровье: " + health + "\n");
        }
    }
    public void poison(int round){
        poisonRound = round;
    }

    public abstract void attackEnemy(Enemy enemy);
}
