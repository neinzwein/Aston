package stage1.Home_work_1.InternetShop.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int id;
    private List<Product> products = new ArrayList<>();
    private boolean paid;

    public Order(int id){
        this.id = id;
        this.paid = false;
    }

    public int getId(){
        return id;
    }

    public List<Product> getProducts(){
        return products;
    }

    public double getSumma(){
        double summa = 0.0;
        for (Product product : products){
            summa += product.getPrice() * product.getQuantity();
        }
        return summa;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void pay(){
        this.paid = true;
    }

    public boolean isPaid(){
        return paid;
    }

}
