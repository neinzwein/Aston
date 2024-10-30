package Home_work_1.InternetShop.logic;

import Home_work_1.InternetShop.models.Client;
import Home_work_1.InternetShop.models.Order;
import Home_work_1.InternetShop.models.Product;

import java.util.List;

public class ClientLogic {
    public Order makeOrder(Client client){
        return new Order(client.getId());
    }

    public void ProductToOrder(Order order, Product product){
        order.addProduct(product);
    }

    public void payOrder(Client client, Order order){
        if (!order.isPaid()){
            order.pay();
        }
    }
}
