package stage1.Home_work_2.model;

public class Mage extends Hero{

    public Mage(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (!isAlive()){
            return;
        }
        int damage = 30;
        System.out.println(getName() + " Колдует огненный шар на " + enemy.getName());
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
    }

    public boolean spell(Enemy enemy){
        if (Math.random() < 0.2){
            System.out.println("Маг накастовал понос. " + enemy.getName() + " оглушен на 1 ход.\n");
            return true;
        }
        else {
            return false;
        }
    }
}
