package stage1.Home_work_1.InternetShop.models;

public class Admin {
    private int id;
    private String name;

    public Admin(int id, String name){
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
