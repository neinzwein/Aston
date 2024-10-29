package Home_work_1.InternetShop.models;

public class AdminClient {
    private int id;
    private String name;

    public AdminClient(int id, String name){
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
