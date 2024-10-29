package Home_work_1.InternetShop.models;

import java.util.List;

public class Order {
    private final int id;
    private final double summa;
    private final List<Product> products;

    public Order(int id, double summa, List<Product> products){
        this.id = id;
        this.summa = summa;
        this.products = products;
    }

    public int getId(){
        return id;
    }
    public double getSumma(){
        return summa;
    }
    public List<Product> getProducts(){
        return products;
    }
}
