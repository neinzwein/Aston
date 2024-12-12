package stage1.Home_work_2.model;

public class Archer extends Hero{

    public Archer(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        int damage = 20;
        if (Math.random() < 0.1){
            damage = 60;
            System.out.println(getName() + " Пустил три стрелы в " + enemy.getName());
        }
        else if (Math.random() < 0.3){
            damage = 40;
            System.out.println(getName() + " Пустил две стрелы в" + enemy.getName());
        }
        else {
            System.out.println(getName() + " Пускает стрелу в " + enemy.getName());
        }
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
    }
}
