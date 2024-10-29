package Home_work_1.InternetShop.models;

public class Product {
    private int id;
    private int quantity;
    private double price;
    private String name;
    private String about;

    public Product(int id, int quantity, double price, String name){
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getAbout(){
        return about;
    }
}
