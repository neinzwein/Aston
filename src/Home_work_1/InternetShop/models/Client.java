package Home_work_1.InternetShop.models;

public class Client {
    private int id;
    private String name;

    public Client(int id, String name){
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
