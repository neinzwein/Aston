package stage1.Home_work_1.InternetShop;

/*
7.	Система Интернет-магазин.
Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары.
Администратор регистрирует Продажу и может занести неплательщиков
в “черный список”.
*/

import stage1.Home_work_1.InternetShop.logic.*;
import stage1.Home_work_1.InternetShop.models.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();
        Product laptop = new Product(1001, 1, 2000, "Laptop", "Asus laptop");
        catalog.add(laptop);

        Admin admin = new Admin(1, "Administrator");
        Client client = new Client(2, "random person");
        AdministratorLogic administratorLogic = new AdministratorLogic(catalog);
        ClientLogic clientLogic = new ClientLogic();

        Order order = clientLogic.makeOrder(client);
        clientLogic.ProductToOrder(order, laptop);
        // Меняем описание товара
        System.out.println(laptop.getAbout());

        administratorLogic.addUpdateInfo(admin, 1001, "Asus laptop 2024");

        System.out.println(laptop.getAbout());

        clientLogic.payOrder(client, order);
        administratorLogic.registrySell(admin, order);

        // После оплаты кидаем в черный лист.
        administratorLogic.addToBlackList(client);
        System.out.println("Доставки не будет!");
    }
}
