package Home_work_2.model;

abstract public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean isAlive(){
        if (health > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void takeDamage(int damage){
        if (health < damage){
            damage = health;
        }
        health -= damage;
        System.out.println("Враг получил: " + damage + "\nОсталось здоровья: " + health + "\n");
    }


    public abstract void attackHero(Hero hero);

}
