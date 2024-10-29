package Home_work_1.Faculty.model;

public class Teacher {
    private int id;
    private String name;

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
