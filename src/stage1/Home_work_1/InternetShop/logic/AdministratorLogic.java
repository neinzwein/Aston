package stage1.Home_work_1.InternetShop.logic;

import stage1.Home_work_1.InternetShop.models.Admin;
import stage1.Home_work_1.InternetShop.models.Client;
import stage1.Home_work_1.InternetShop.models.Order;
import stage1.Home_work_1.InternetShop.models.Product;

import java.util.ArrayList;
import java.util.List;

public class AdministratorLogic {
    private  List<Client> blackList = new ArrayList<>();
    private List<Product> catalog;

    public AdministratorLogic(List<Product> catalog){
        this.catalog = catalog;
    }

    public void addUpdateInfo(Admin admin,int idProduct, String about){
        for (Product product : catalog){
            if (product.getId() == idProduct){
                product.setAbout(about);
                return;
            }
        }
    }
    public void registrySell(Admin admin, Order order){
        // не понимаю, что значит регистрируем продажу.
        if (order.isPaid()){
            System.out.println("Заказ оплачен.");
        }
    }

    // добавляем в черный лист // потом проверка
    public void addToBlackList(Client client){
        blackList.add(client);
        System.out.println(client.getName() + " был добавлен в черный список.");
    }

    public boolean isInBlackList(Client client){
        return blackList.contains(client);
    }
}
