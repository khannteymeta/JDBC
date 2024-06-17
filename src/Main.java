import controller.CustomerContoller;
import controller.OrderController;
import controller.ProductController;
import model.dao.CustomerImpl;
import model.dao.OrderDaoImpl;
import model.dao.ProductDaoImpl;
import model.entity.Customer;
import model.entity.Order;
import model.entity.Product;
import view.View;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        CustomerContoller customerContoller = new CustomerContoller();
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                switch (View.menu()){
                    case 0:
                        System.exit(0);
                        break;

                    case 1:
                        break;

                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

  }
}